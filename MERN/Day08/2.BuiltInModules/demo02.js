const fs = require('fs')

function writeDataInFile() {
    // Async function
    // fs.writeFile()
    // Sync function
    fs.writeFileSync("file1.txt", "India is my country. All indians are my brothers and sisters")
}
//writeDataInFile()

function readFromFileSync() {
    // Task-1
    console.log("File reading started...") // 5 hrs
    const data = fs.readFileSync("file1.txt")
    console.log("File reading finished...")
    console.log(`data - ${data}`)

    // Task-2
    console.log("Math calculation started...")
    const result = 7246893 * 32786483
    console.log("Math calculation finished...")
    console.log(`result - ${result}`)
}

//readFromFileSync()

function readFromFileASync() {
    // Task-1
    console.log("File reading started...") // 5 hrs
    // Async function
    fs.readFile("file1.txt", (error, data) => {
        console.log("File reading finished...")
        console.log(`data - ${data}`)
    })

    // Task-2
    console.log("Math calculation started...")
    const result = 7246893 * 32786483
    console.log("Math calculation finished...")
    console.log(`result - ${result}`)
}

readFromFileASync()