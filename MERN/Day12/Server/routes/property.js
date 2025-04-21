const express = require('express')
const pool = require('../db/db')
const result = require('../utils/result')
const router = express.Router()

router.post('/', (req, res) => {
    const { categoryId, title, details, address, contactNo, ownerName, isLakeView,
        isTV, isAC, isWifi, isMiniBar, isBreakfast, isParking, guests,
        bedrooms, beds, bathrooms, rent } = req.body

    const sql = `INSERT INTO property(categoryId, title,details, address, 
        contactNo, ownerName, isLakeView,
        isTV, isAC, isWifi, isMiniBar, isBreakfast, isParking, guests,
        bedrooms, beds, bathrooms, rent) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)`

    pool.query(sql, [categoryId, title, details, address, contactNo, ownerName, isLakeView,
        isTV, isAC, isWifi, isMiniBar, isBreakfast, isParking, guests,
        bedrooms, beds, bathrooms, rent], (error, data) => {
            res.send(result.createResult(error, data))
        })
})

router.get('/', (req, res) => {
    const sql = `SELECT id,title,details,rent,profileImage FROM property`
    pool.query(sql, (error, data) => {
        res.send(result.createResult(error, data))
    })
})
module.exports = router