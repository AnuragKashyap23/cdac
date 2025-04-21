import React, { useContext } from 'react'
import { MyContext } from '../App'

function FirstChildComponent() {
  const { count } = useContext(MyContext)

  return (
    <div>
      <h1>First Page Child Component</h1>
      <h2>Count = {count}</h2>
    </div>
  )
}

export default FirstChildComponent
