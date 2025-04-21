// importing the user defined Math module
const math = require('./Math5')

//math(10, 20) // NOT OK
//math.mymul(10, 20) // NOT OK

// It is also a module
math.sub(20, 10)
math.div(20, 5)