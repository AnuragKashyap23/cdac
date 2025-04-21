const express = require('express')
const jwt = require('jsonwebtoken')
const cryptoJs = require('crypto-js')
const pool = require('../db/mysql')
const config = require('../utils/config')
const result = require('../utils/result')
const router = express.Router()

router.post('/signup', (request, response) => {
    const { name, email, password, mobile, city } = request.body
    const encryptedPassword = cryptoJs.SHA256(password)
    const sql = `INSERT INTO user
        (name,email,password,mobile,city)
    VALUES
        ("${name}","${email}","${encryptedPassword}","${mobile}","${city}")`
    pool.query(sql, (error, data) => {
        response.send(result.createResult(error, data))
    })
})

router.post('/signin', (request, response) => {
    const { email, password } = request.body
    const encryptedPassword = cryptoJs.SHA256(password)
    const sql = `SELECT * FROM user WHERE email = "${email}" AND password = "${encryptedPassword}"`
    pool.query(sql, (error, data) => {
        if (data) {
            if (data.length != 0) {
                // token generation
                const payload = {
                    id: data[0].id
                }
                const token = jwt.sign(payload, config.secret)
                const body = {
                    token: token,
                    name: data[0].name,
                    email: data[0].email,
                    mobile: data[0].mobile,
                    city: data[0].city
                }
                response.send(result.createSuccessResult(body))
            }
            else
                response.send(result.createErrorResult('Invalid email or password'))

        } else
            response.send(result.createErrorResult(error))
    })
})


router.put('/profile', (request, response) => {
    const { mobile, city } = request.body
    const sql = `UPDATE user SET mobile = "${mobile}", city = "${city}" WHERE id = ${request.headers.id}`
    pool.query(sql, (error, data) => {
        response.send(result.createResult(error, data))
    })
})

router.delete('/', (request, response) => {
    const sql = `DELETE FROM user WHERE id = ${request.headers.id}`
    pool.query(sql, (error, data) => {
        response.send(result.createResult(error, data))
    })
})



module.exports = router