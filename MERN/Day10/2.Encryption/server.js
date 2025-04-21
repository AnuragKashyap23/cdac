// Importing built-in Modules
const express = require ('express')

// Importing user defined modules
const userRouter = require('./routes/user')

// Creating express Object
const app = express()

// Adding middlewares
app.use(express.json())
app.use('/user', userRouter)

app.listen(4000, 'localhost', () => {
    console.log('server started at port 4000')
})