const express = require('express')
const pool = require('../db/mysqldb')
const result = require('../utils/result')
const router = express.Router()


router.get('/', (request, response) => {
    const sql = `SELECT * FROM user`
    pool.query(sql, (error, data) => {
        response.send(result.createResult(error, data))
    })
})
module.exports = router