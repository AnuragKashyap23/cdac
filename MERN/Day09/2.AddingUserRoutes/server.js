const express = require('express')
const app = express()

app.get('/user', (request, response) => {
    response.send('user get method called')
})

app.post('/user', (request, response) => {
    response.send('user post method called')
})

app.put('/user', (req, res) => {
    res.send('user put method called')
})

app.listen(4000, 'localhost', () => {
    console.log('server started at port 4000')
})