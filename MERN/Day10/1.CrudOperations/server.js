// Importing built-in Modules
const express = require('express')

// Importing user defined modules
const userRouter = require('./routes/user')
const productRouter = require('./routes/product')

// Creating express Object
const app = express()

// Adding middlewares
app.use(express.json()) // that will convert the body in the request in to json object
app.use('/user', userRouter)
app.use('/product', productRouter)

app.listen(4000, 'localhost', () => {
    console.log('server started at port 4000')
})