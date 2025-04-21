const express = require('express')
const app = express()

const users = [
    { uid: 1, name: "Anil", age: 30 },
    { uid: 2, name: "Mukesh", age: 35 },
    { uid: 3, name: "Ramesh", age: 40 },
    { uid: 4, name: "Suresh", age: 45 }
]

const products = [
    { pid: 1, name: "Pen", price: 10 },
    { pid: 2, name: "Pencil", price: 5 },
    { pid: 3, name: "Book", price: 40 },
    { pid: 4, name: "Eraser", price: 5 }
]

app.get('/user', (request, response) => {
    response.send(users)
})

app.post('/user/signup', (request, response) => {
    response.send('user inserted successfully')
})

app.post('/user/signin', (request, response) => {
    response.send('using email, password user signed in successfully')

})

app.put('/user/profile', (request, response) => {
    response.send('profile updated successfully')
})

app.delete('/user/:id', (request, response) => {
    response.send('deleting user finished')
})

app.get('/product', (request, response) => {
    response.send(products)
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