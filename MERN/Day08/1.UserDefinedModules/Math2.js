// user defined module
function add(n1, n2) {
    console.log(`Addition - ${n1 + n2}`)
}

function mul(n1, n2) {
    console.log(`Multiplication - ${n1 * n2}`)
}

// exporting the add function
module.exports = add
// This will over write the function add with mul
module.exports = mul