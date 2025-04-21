import React from 'react'
import { useDispatch, useSelector } from 'react-redux'
import { increment, decrement } from '../slices/countSlice'

function First() {
  // get the selector to read the global state
  const countSlice = useSelector((state) => state.countSlice)

  // get the dispatch function reference
  const dispatch = useDispatch()

  return (
    <div>
      <h1 className='page-header'>First</h1>
      <h3>count = {countSlice.count}</h3>

      <button
        onClick={() => {
          dispatch(increment())
        }}
      >
        increment
      </button>

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

export default First
