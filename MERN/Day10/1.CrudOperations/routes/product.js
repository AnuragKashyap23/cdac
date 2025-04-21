const express = require('express')
const result = require('../utils/result')
const pool = require('../db/mysql')
const router = express.Router()

router.get('/', (request, response) => {
    const sql = `SELECT * FROM product`
    pool.query(sql, (error, data) => {
        response.send(result.createResult(error, data))
    })
})

router.post('/', (request, response) => {
    const { name, price } = request.body
    const sql = `INSERT INTO product(name,price) VALUES(?,?)`
    pool.query(sql, [name, price], (error, data) => {
        response.send(result.createResult(error, data))
    })
})

router.put('/', (request, response) => {
    const { pid, price } = request.body
    const sql = `UPDATE product SET price = ? WHERE pid = ?`
    pool.query(sql, [price, pid], (error, data) => {
        response.send(result.createResult(error, data))
    })
})

router.delete('/:id', (request, response) => {
    const sql = `DELETE FROM product WHERE pid = ?`
    pool.query(sql, [request.params.id], (error, data) => {
        response.send(result.createResult(error, data))
    })
})

module.exports = router