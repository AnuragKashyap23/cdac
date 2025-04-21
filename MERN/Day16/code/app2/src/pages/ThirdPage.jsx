import React, { useContext } from 'react'
import { MyContext } from '../App'

function ThirdPage() {
  const { count, setCount } = useContext(MyContext)

  const onIncrement = () => {
    setCount(count + 1)
  }

  return (
    <div>
      <h1 className='page-header'>Third Component</h1>

      <h3>Count = {count}</h3>

      <button
        onClick={onIncrement}
        className='btn btn-success'
      >
        Increment
      </button>
    </div>
  )
}

export default ThirdPage
