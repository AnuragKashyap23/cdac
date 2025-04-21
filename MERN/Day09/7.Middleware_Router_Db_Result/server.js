const express = require('express')
const userRouter = require('./routes/user')
const productRouter = require('./routes/product')
const app = express()

//middleware - executes for all the requests
app.use((request, response, next) => {
    console.log("middleware called")
    console.log("url " + request.url)
    response.setHeader('Access-Control-Allow-Origin', '*')
    next() // continue to the next route
})

// middleware - executes for all the requests with path 
// that starts with /user
app.use('/user', userRouter)

// middleware - executes for all the requests with path 
// that starts with /product
app.use('/product', productRouter)

app.listen(4000, 'localhost', () => {
    console.log('server started at port 4000')
})