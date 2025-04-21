const express = require('express')
const mysql = require('mysql')
const app = express()

const connection = mysql.createConnection({
    host: 'localhost',
    user: 'root',
    password: 'root',
    database: 'dac_db'
})

app.get('/user', (request, response) => {
    const sql = `SELECT * FROM user`
    connection.connect() // creating the actual connection with the database
    connection.query(sql, (error, data) => {
        connection.end()
        // once the connection is closed it can have the difficulty in opening
        // the connection once again after saying connection.connect()
        // It is recommended not to end the connection or create multiple
        // objects of the connection
        if (data)
            response.send({ status: "success", data: data })
        else
            response.send({ status: "error", error: error })
    })
})

app.get('/product', (request, response) => {
    const sql = `SELECT * FROM product`
    connection.connect()
    connection.query(sql, (error, data) => {
        connection.end()
        if (data)
            response.send({ status: "success", data: data })
        else
            response.send({ status: "error", error: error })
    })
})

app.listen(4000, 'localhost', () => {
    console.log('server started at port 4000')
})