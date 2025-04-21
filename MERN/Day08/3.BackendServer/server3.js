const http = require('http')

const users = [
    { uid: 1, name: "Anil", age: 30 },
    { uid: 2, name: "Mukesh", age: 35 },
    { uid: 3, name: "Ramesh", age: 40 },
    { uid: 4, name: "Suresh", age: 45 }
]

const products = [
    { pid: 1, name: "Pen", price: 10 },
    { pid: 2, name: "Pencil", price: 5 },
    { pid: 3, name: "Eraser", price: 5 },
    { pid: 4, name: "Books", price: 45 }
]

const server = http.createServer((req, res) => {
    if (req.url == '/user') {
        if (req.method == 'GET') {
            res.setHeader('Access-Control-Allow-Origin', '*')
            res.writeHead(200, { "content-type": "application/json" })
            res.write(JSON.stringify(users))
            res.end()
        }
        else if (req.method == 'POST') {
            res.end("User Post method called")
        } else if (req.method == 'PUT') {
            res.end("User PUT method called")
        } else if (req.method == 'DELETE') {
            res.end("User DELETE method called")
        }
    } else if (req.url == '/product') {
        if (req.method == 'GET') {
            res.setHeader('Access-Control-Allow-Origin', '*')
            res.writeHead(200, { "content-type": "application/json" })
            res.write(JSON.stringify(products))
            res.end()
        }
        else if (req.method == 'POST') {
            res.end("Product Post method called")
        } else if (req.method == 'PUT') {
            res.end("Product PUT method called")
        } else if (req.method == 'DELETE') {
            res.end("Product DELETE method called")
        }
    }
    else
        res.end(`{ "error": "Invalid request" }`)

})

server.listen(4000, "localhost", () => {
    console.log("Server started at port 4000")
})