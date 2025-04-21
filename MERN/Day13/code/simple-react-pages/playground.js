// functional programming language
// - a language which has one or more of the following properties
//   - function is considered as first class citizen
//     (you can create a reference or alias of a function)
//   - a function can be passed as an argument to another function (callback)
//   - a function can be returned as a return value of a function

function function1() {
  // array of numbers
  const numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

  // get the square of each number
  for (const number of numbers) {
    console.log(`square of ${number} = ${number ** 2}`)
  }
}

// function1()

function function2() {
  // array of numbers
  const numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

  // empty array to collect square of each number
  const squares = []

  // get the square of each number
  for (const number of numbers) {
    squares.push(number ** 2)
  }

  console.log(`numbers = ${numbers}`)
  console.log(`squares = ${squares}`)
}

// function2()

function function3() {
  // array of numbers
  const numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

  // function to get square of a number
  const square = (number) => {
    console.log(`inside square: ${number}`)
    return number ** 2
  }

  // internally the map function will iterate over the numbers collection
  // and calls the square function for each of the numbers in the collection
  // and receives the square of each value
  // and collects all the square values in the squares array

  // map always starts from index 0 and ends at the last value of the collection
  // it can not be stopped in between
  const squares = numbers.map(square)

  console.log(`numbers = ${numbers}`)
  console.log(`squares = ${squares}`)
}

// function3()

function function4() {
  // array of numbers
  const numbers = [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]

  // iterate using traditional for loop
  // for (let index = 0; index < numbers.length; index++) {
  //   console.log(`value at ${index} = ${numbers[index]}`)
  // }

  // iterate using for..of loop
  // for (const number of numbers) {
  //   console.log(`number = ${number}`)
  // }

  // iterate using for..in loop
  // for (const index in numbers) {
  //   console.log(`value at ${index} = ${numbers[index]}`)
  // }

  // iterate using forEach loop
  numbers.forEach((number) => {
    console.log(`number = ${number}`)
  })
}

// function4()

function function5() {
  // array of numbers
  const numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

  // get cube of every number
  const cubes = numbers.map((number) => {
    return number ** 3
  })
  console.log(`numbers = ${numbers}`)
  console.log(`cubes = ${cubes}`)
}

// function5()

function function6() {
  // array of numbers
  const numbers = [3, 29, 40, 35, 67, 83, 91, 25, 60]

  // get only even numbers
  const evenNumbers = []
  for (const number of numbers) {
    if (number % 2 == 0) {
      evenNumbers.push(number)
    }
  }

  console.log(`numbers = ${numbers}`)
  console.log(`even numbers = ${evenNumbers}`)
}

// function6()

function function7() {
  // array of numbers
  const numbers = [3, 29, 40, 35, 67, 83, 91, 25, 60]

  // filter iterates over the numbers array
  // retrieves each value and calls the arrow function
  // if the condition is true, it returns the number
  // else it does nothing
  const evenNumbers = numbers.filter((number, index) => {
    console.log(`index = ${index}`)
    return number % 2 == 0
  })
  console.log(`even numbers = ${evenNumbers}`)

  const oddNumbers = numbers.filter((number) => {
    return number % 2 != 0
  })
  console.log(`odd numbers = ${oddNumbers}`)
}

// function7()

function function8() {
  // array of numbers
  const temperatures_c = [29, 23, 26, 28, 30, 33, 34]

  const temperatures_f = temperatures_c.map((temperature) => {
    return 32 + temperature * (9 / 5)
  })
  console.log(`temperatures_c = ${temperatures_c}`)
  console.log(`temperatures_f = ${temperatures_f}`)
}

// function8()

function function9() {
  // array of numbers
  const marks = [30, 20, 15, 20, 12, 19, 38]

  const passed = marks.filter((mark) => {
    return mark >= 20
    // if (mark >= 20) {
    //   return true
    // } else {
    //   return false
    // }
  })
  console.log(`marks = ${marks}`)
  console.log(`passed = ${passed}`)
}

function9()
