const express = require('express')
const cors = require('cors')

// user defined modules
const authorization = require('./routes/authorization')
const userRouter = require('./routes/user')
const taskRouter = require('./routes/tasks')

// creating the express object
const app = express()

// add the middlewares
app.use(cors())
app.use(express.json())
app.use(authorization)

app.use('/user', userRouter)
app.use('/task', taskRouter)

// starting the server at port 4000
app.listen(4000, 'localhost', () => {
  console.log('server started at port 4000')
})
