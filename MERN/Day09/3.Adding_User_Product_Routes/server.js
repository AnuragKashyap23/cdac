const express = require('express')
const app = express()

app.get('/user', (request, response) => {
    console.log('/user with get method called')
    response.send('All users')
})

app.post('/user/signup', (request, response) => {
    console.log('/user/signup with post method called')
    response.send('user inserted successfully')
})

app.post('/user/signin', (request, response) => {
    console.log('/user/signin with post method called')
    response.send('using email, password user signed in successfully')

})

app.put('/user/profile', (request, response) => {
    console.log('/user/profile with put method called')
    response.send('profile updated successfully')
})

app.delete('/user/:id', (request, response) => {
    console.log('/user/:id with delete method called')
    response.send('deleting user finished')
})

app.get('/product', (request, response) => {
    response.send('All products')
})

app.post('/product', (request, response) => {
    response.send('Product inserted successfully')
})

app.put('/product', (request, response) => {
    response.send('Product Updated')
})

app.delete('/product/:id', (request, response) => {
    response.send('Product Deleted')
})

app.listen(4000, 'localhost', () => {
    console.log('server started at port 4000')
})