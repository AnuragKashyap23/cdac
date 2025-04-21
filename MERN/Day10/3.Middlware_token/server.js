// Importing built-in Modules
const express = require('express')

// Importing user defined modules
const userRouter = require('./routes/user')
const productRouter = require('./routes/product')
const myMiddleware = require('./routes/middleware')

// Creating express Object
const app = express()

// Adding middlewares
app.use(express.json())
// app.use((request, response, next) => {

// }) 
app.use(myMiddleware)
app.use('/user', userRouter)
app.use('/product', productRouter)

app.listen(4000, 'localhost', () => {
    console.log('server started at port 4000')
})