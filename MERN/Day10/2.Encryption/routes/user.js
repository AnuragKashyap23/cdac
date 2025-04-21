const express = require('express')
const jwt = require('jsonwebtoken')
const cryptoJs = require('crypto-js')
const pool = require('../db/mysql')
const config = require('../utils/config')
const result = require('../utils/result')
const router = express.Router()

router.post('/signin', (request, response) => {
    const { email, password } = request.body
    const encryptedPassword = cryptoJs.SHA256(password)
    const sql = `SELECT * FROM user WHERE email = "${email}" AND password = "${encryptedPassword}"`
    pool.query(sql, (error, data) => {
        if (data) {
            if (data.length == 0)
                response.send(result.createErrorResult("Invalid email or password"))
            else {
                // user is present in the database
                // create a token for this user and send the token in the response

                // create a paylod which will hide the data inside it
                const payload = {
                    id: data[0].id
                }

                //create the token using the payload and the secret
                const token = jwt.sign(payload, config.secret)

                // create the response body in which add the token 
                // along with the required data
                const body = {
                    token: token,
                    name: data[0].name,
                    email: data[0].email,
                    mobile: data[0].mobile,
                    city: data[0].city
                }
                response.send(result.createSuccessResult(body))
            }
        }
        else
            response.send(result.createErrorResult(error))
    })
})

router.post('/signup', (request, response) => {
    const { name, email, password, mobile, city } = request.body
    const encryptedPassword = cryptoJs.SHA256(password)
    // const sql = `INSERT INTO user(name,email,password,mobile,city) VALUES(?,?,?,?,?)`
    const sql = `INSERT INTO user(name,email,password,mobile,city) 
    VALUES("${name}","${email}","${encryptedPassword}","${mobile}","${city}")`
    pool.query(sql, (error, data) => {
        response.send(result.createResult(error, data))
    })
})

router.put('/profile', (request, response) => {
    const token = request.headers.token
    if (token) {
        try {
            const payload = jwt.verify(token, config.secret)
            const { mobile, city } = request.body
            const sql = `UPDATE user SET mobile = ?,city = ? WHERE id = ?`
            pool.query(sql, [mobile, city, payload.id], (error, data) => {
                response.send(result.createResult(error, data))
            })
        } catch (e) {
            response.send(result.createErrorResult("Token is Invalid"))
        }
    }
    else
        response.send(result.createErrorResult("Token is Missing"))
})



module.exports = router