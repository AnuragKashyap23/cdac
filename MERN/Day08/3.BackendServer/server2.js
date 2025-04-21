const http = require('http')

const server = http.createServer((req, res) => {
    console.log(`url - ${req.url} , method - ${req.method}`)
    // adding the headers
    res.writeHead(200, { "content-type": "text/html" })
    // write the contents in the response
    res.write("<h1>Welcome</h1>")
    res.write("<h2>To Backend Server</h2>")
    if (req.url == '/user') {
        if (req.method == 'GET') {
            res.end("User GET Method Called")
        }
        else if (req.method == 'POST') {
            res.end("User POST Method Called")
        }
        else if (req.method == 'PUT') {
            res.end("User PUT Method Called")
        }
        else if (req.method == 'DELETE') {
            res.end("User DELETE Method Called")
        }
    } else if (req.url == '/product') {
        if (req.method == 'GET') {
            res.end("Product GET Method Called")
        }
        else if (req.method == 'POST') {
            res.end("Product POST Method Called")
        }
        else if (req.method == 'PUT') {
            res.end("Product PUT Method Called")
        }
        else if (req.method == 'DELETE') {
            res.end("Product DELETE Method Called")
        }
    }
    else {

        //send the response to the client
        res.end()
    }

})

server.listen(4000, "localhost", () => {
    console.log("Server started at port 4000")
})