const express = require('express')
const userRouter = require('./routes/user')
const productRouter = require('./routes/product')
const app = express()

// use a middleware
// app.use(userRouter)
app.use('/user', userRouter)
// app.use(productRouter)
app.use('/product', productRouter)


app.listen(4000, 'localhost', () => {
    console.log('server started at port 4000')
})