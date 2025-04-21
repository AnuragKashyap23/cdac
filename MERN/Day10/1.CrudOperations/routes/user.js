const express = require('express')
const pool = require('../db/mysql')
const result = require('../utils/result')
const router = express.Router()

router.get('/', (request, response) => {
    const sql = `SELECT * FROM user`
    pool.query(sql, (error, data) => {
        response.send(result.createResult(error, data))
    })
})

router.post('/signin', (request, response) => {
    const { email, password } = request.body
    const sql = `SELECT * FROM user WHERE email = "${email}" AND password = "${password}"`
    pool.query(sql, (error, data) => {
        if (data) {
            if (data.length == 0)
                response.send(result.createErrorResult("Invalid email or password"))
            else
                response.send(result.createSuccessResult(data))
        }
        else
            response.send(result.createErrorResult(error))
    })
})

router.post('/signup', (request, response) => {
    console.log(request.body)
    // const name = request.body.name
    // const email = request.body.email
    // const password = request.body.password
    // const mobile = request.body.mobile
    // const city = request.body.city

    //destructucting of json object
    const { name, email, password, mobile, city } = request.body
    const sql = `INSERT INTO user(name,email,password,mobile,city)
    VALUES("${name}","${email}","${password}","${mobile}","${city}")`
    pool.query(sql, (error, data) => {
        response.send(result.createResult(error, data))
    })
})

router.put('/profile', (request, response) => {
    const { id, mobile, city } = request.body
    const sql = `UPDATE user SET mobile = "${mobile}", city="${city}" WHERE id=${id}`
    pool.query(sql, (error, data) => {
        response.send(result.createResult(error, data))
    })
})

router.delete('/:id', (request, response) => {
    const id = request.params.id
    const sql = `DELETE FROM user WHERE id = ${id}`
    pool.query(sql, (error, data) => {
        response.send(result.createResult(error, data))
    })
})

module.exports = router