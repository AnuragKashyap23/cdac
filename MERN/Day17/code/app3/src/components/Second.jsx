import React from 'react'
import { useDispatch, useSelector } from 'react-redux'
import { decrement } from '../slices/myCountSlice'

function Second() {
  const myCountSlice = useSelector((store) => store.myCountSlice)
  const dispatch = useDispatch()

  return (
    <div>
      <h1 className='page-header'>Second</h1>
      <h3>Count = {myCountSlice.value}</h3>

      <button
        onClick={() => {
          dispatch(decrement())
        }}
      >
        decrement
      </button>
    </div>
  )
}

export default Second
