const express = require('express')
const pool = require('../db/mysql')
const result = require('../utils/result')
const router = express.Router()

router.get('/', (request, response) => {
    const sql = `SELECT * FROM product`
    pool.query(sql, (error, data) => {
        response.send(result.createResult(error, data))
    })
})

router.post('/add', (request, response) => {
    const { name, price } = request.body
    const sql = `INSERT INTO product
        (name,price)
    VALUES
        ("${name}",${price})`
    pool.query(sql, (error, data) => {
        response.send(result.createResult(error, data))
    })
})

router.put('/update', (request, response) => {
    const { id, price } = request.body
    const sql = `UPDATE product SET price = ${price} WHERE pid = ${id}`
    pool.query(sql, (error, data) => {
        response.send(result.createResult(error, data))
    })
})

router.delete('/:id', (request, response) => {
    const id = request.params.id
    const sql = `DELETE FROM product WHERE pid = ${id}`
    pool.query(sql, (error, data) => {
        response.send(result.createResult(error, data))
    })
})


module.exports = router
