// user defined module
const PI = 3.14

const p1 = {
    name: "Anil",
    age: 30
}

const add = function (n1, n2) {
    console.log(`Addition - ${n1 + n2}`)
}

const arithmetic = {
    sub: (n1, n2) => {
        console.log(`Substraction - ${n1 - n2}`)
    },
    mul: (n1, n2) => {
        console.log(`Multiplication - ${n1 - n2}`)
    }
}

module.exports = PI // m in the demo08.js will be a variable
module.exports = p1 // m in the demo08.js will be a object
module.exports = add // m in the demo08.js will be a function
module.exports = arithmetic //m in the demo08.js will be a object
module.exports = { PI, p1, add, arithmetic } // m in the demo08.js will be the module