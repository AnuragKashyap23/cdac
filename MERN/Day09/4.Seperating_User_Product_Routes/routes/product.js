const express = require('express')
const router = express.Router()


// router.get('/product', (request, response) => {
router.get('/', (request, response) => {
    response.send('All products')
})

// router.post('/product', (request, response) => {
router.post('/', (request, response) => {
    response.send('Product inserted successfully')
})

// router.put('/product', (request, response) => {
router.put('/', (request, response) => {
    response.send('Product Updated')
})

// router.delete('/product/:id', (request, response) => {
router.delete('/:id', (request, response) => {
    response.send('Product Deleted')
})

module.exports = router