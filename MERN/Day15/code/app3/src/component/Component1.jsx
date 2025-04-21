import React, { useEffect, useState } from 'react'

function Component1() {
  const [count1, setCount1] = useState(10)
  const [count2, setCount2] = useState(20)

  useEffect(() => {
    console.log(`Component1 is mounted`)
  }, [])

  useEffect(() => {
    console.log(`Component1 state changed`)
  })

  useEffect(() => {
    console.log(`Component1 state changed because of count1`)
  }, [count1])

  useEffect(() => {
    console.log(`Component1 state changed because of count2`)
  }, [count2])

  const onUpdateCount1 = () => {
    setCount1(count1 + 1)
  }

  const onUpdateCount2 = () => {
    setCount2(count2 + 1)
  }

  return (
    <div>
      <h1>Component 1</h1>
      <div>
        <span>count1: {count1}</span>
        <button onClick={onUpdateCount1}>update count1</button>
      </div>
      <div>
        <span>count2: {count2}</span>
        <button onClick={onUpdateCount2}>update count2</button>
      </div>
    </div>
  )
}

export default Component1
