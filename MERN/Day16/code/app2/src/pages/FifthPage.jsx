import React from 'react'

function FifthPage({ count, setCount }) {
  return (
    <div>
      <h1 className='page-header'>Fifth Component</h1>
      <h3>Count = {count}</h3>
      <button
        onClick={() => {
          setCount(count + 10)
        }}
        className='btn btn-success'
      >
        Update
      </button>
    </div>
  )
}

export default FifthPage
