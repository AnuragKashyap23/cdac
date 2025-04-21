import React, { useContext } from 'react'
import { MyContext, NumContext } from '../App'
import FirstChildComponent from '../components/FirstChildComponent'

function FirstPage() {
  const { count, setCount } = useContext(MyContext)
  const { number } = useContext(NumContext)

  const onIncrement = () => {
    setCount(count + 1)
  }

  return (
    <div>
      <h1 className='page-header'>First Component</h1>
      <h3>Count = {count}</h3>
      <h3>Number = {number}</h3>

      <button
        onClick={onIncrement}
        className='btn btn-success'
      >
        Increment
      </button>
      <hr />
      <FirstChildComponent />
    </div>
  )
}

export default FirstPage
