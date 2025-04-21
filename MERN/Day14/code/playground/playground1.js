function function1() {
  const array = [10, 20, 30]
  console.log(`array[0] = ${array[0]}`)
  console.log(`array[1] = ${array[1]}`)
  console.log(`array[2] = ${array[2]}`)
}

// function1()

function function2() {
  // array destructuring
  const [p1, p2, p3] = [10, 20, 30]

  // p1, p2 and p3 will be created as variables with:
  // p1 => array[0]
  // p2 => array[1]
  // p3 => array[2]

  console.log(`array[0] = ${p1}`)
  console.log(`array[1] = ${p2}`)
  console.log(`array[2] = ${p3}`)
}

function2()
