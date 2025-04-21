// get the express module
const express = require('express')

//create the express object
const app = express()

// route
// Method(path,handler)
app.get('/', (request, response) => {
    response.send("Hello From express server")
})

// express application is listening on the port 4000
app.listen(4000, 'localhost', () => {
    console.log('express server started at port 4000')
})