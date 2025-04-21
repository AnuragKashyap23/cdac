// import the http module
const http = require('http')

// create the object of the server
const server = http.createServer((request, response) => {
    console.log("Backend server called")
    console.log(`url - ${request.url}`)
    response.end("<h1>Hello from backend server</h1>")
})

// start the server
server.listen(4000, "localhost", () => {
    console.log("server started at port 4000")
})