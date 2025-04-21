import React from 'react'
import { useSelector } from 'react-redux'

function Third() {
  const countSlice = useSelector((state) => state.countSlice)

  return (
    <div>
      <h1 className='page-header'>Third</h1>
      <h3>count = {countSlice.count}</h3>
    </div>
  )
}

export default Third
