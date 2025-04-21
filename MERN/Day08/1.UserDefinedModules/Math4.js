// user defined module
function add(n1, n2) {
    console.log(`Addition - ${n1 + n2}`)
}

function mul(n1, n2) {
    console.log(`Multiplication - ${n1 * n2}`)
}

// exporting the math module
module.exports = add
module.exports.mymul = mul