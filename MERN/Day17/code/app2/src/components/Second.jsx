import React from 'react'
import { useSelector } from 'react-redux'

function Second() {
  // get the count from global store
  const countSlice = useSelector((state) => state.countSlice)

  return (
    <div>
      <h1 className='page-header'>Second</h1>
      <h3>count = {countSlice.count}</h3>
    </div>
  )
}

export default Second
