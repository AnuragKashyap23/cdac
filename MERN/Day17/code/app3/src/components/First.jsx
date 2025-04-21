import React from 'react'
import { useDispatch, useSelector } from 'react-redux'
import { increment } from '../slices/myCountSlice'

function First() {
  const myCountSlice = useSelector((store) => store.myCountSlice)

  const dispatch = useDispatch()

  return (
    <div>
      <h1 className='page-header'>First</h1>

      <h3>count = {myCountSlice.value}</h3>
      <button
        onClick={() => {
          dispatch(increment())
        }}
      >
        increment
      </button>
    </div>
  )
}

export default First
