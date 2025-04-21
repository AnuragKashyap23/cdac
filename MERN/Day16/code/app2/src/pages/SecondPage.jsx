import React, { useContext } from 'react'
import { MyContext } from '../App'

function SecondPage() {
  const { count, setCount } = useContext(MyContext)

  const onDecrement = () => {
    setCount(count - 1)
  }

  return (
    <div>
      <h1 className='page-header'>Second Component</h1>
      <h3>count = {count}</h3>
      <button
        onClick={onDecrement}
        className='btn btn-danger'
      >
        Decrement
      </button>
    </div>
  )
}

export default SecondPage
