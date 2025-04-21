const express = require('express')
const router = express.Router()

// router.get('/user', (request, response) => {
router.get('/', (request, response) => {
    response.send('All users')
})

// router.post('/user/signup', (request, response) => {
router.post('/signup', (request, response) => {
    response.send('user inserted successfully')
})

// router.post('/user/signin', (request, response) => {
router.post('/signin', (request, response) => {
    response.send('using email, password user signed in successfully')

})

// router.put('/user/profile', (request, response) => {
router.put('/profile', (request, response) => {
    response.send('profile updated successfully')
})

// router.delete('/user/:id', (request, response) => {
router.delete('/:id', (request, response) => {
    response.send('deleting user finished')
})

module.exports = router