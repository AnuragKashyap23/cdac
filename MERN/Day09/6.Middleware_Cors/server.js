const express = require('express')
const mysql2 = require('mysql2')
const app = express()

//middleware
app.use((request, response, next) => {
    console.log("middleware called")
    console.log("url " + request.url)
    response.setHeader('Access-Control-Allow-Origin', '*')
    next() // continue to the next route
})

const pool = mysql2.createPool({
    host: 'localhost',
    user: 'root',
    password: 'root',
    database: 'dac_db'
})

app.get('/user', (request, response) => {
    const sql = `SELECT * FROM user`
    pool.query(sql, (error, data) => {
        if (data)
            response.send({ status: "success", data: data })
        else
            response.send({ status: "error", error: error })
    })
})

app.get('/product', (request, response) => {
    const sql = `SELECT * FROM product`
    pool.query(sql, (error, data) => {
        if (data)
            response.send({ status: "success", data: data })
        else
            response.send({ status: "error", error: error })
    })
})

app.listen(4000, 'localhost', () => {
    console.log('server started at port 4000')
})