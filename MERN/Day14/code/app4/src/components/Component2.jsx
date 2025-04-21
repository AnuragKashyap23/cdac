import { useState } from 'react'

function Component2() {
  const num = 100
  // state member to maintain the counter
  const [value, setValue] = useState(num)

  const onIncrement = () => {
    setValue(value + 1)
  }

  const onDecrement = () => {
    setValue(value - 1)
  }

  return (
    <>
      <h2>Component 2</h2>
      <button onClick={onIncrement}>Increment</button>
      <span style={{ marginLeft: 10, marginRight: 10 }}>value: {value}</span>
      <button onClick={onDecrement}>Decrement</button>
    </>
  )
}

export default Component2
