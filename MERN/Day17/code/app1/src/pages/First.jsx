import React, { useEffect, useState } from 'react'

function First() {
  const [count1, setCount1] = useState(10)
  const [count2, setCount2] = useState(20)

  useEffect(() => {
    console.log(`First component is mounted`)

    return () => {
      console.log('First component is unmounted')
    }
  }, [])

  useEffect(() => {
    console.log('First component state is changed')
  })

  useEffect(() => {
    console.log('count1 is changed')
  }, [count1])

  useEffect(() => {
    console.log('count2 is changed')
  }, [count2])

  return (
    <div>
      <h1 className='page-header'>First</h1>
      <div>count1 = {count1}</div>
      <button
        onClick={() => {
          setCount1(count1 + 1)
        }}
      >
        update count1
      </button>
      <hr />
      <div>count2 = {count2}</div>
      <button
        onClick={() => {
          setCount2(count2 + 1)
        }}
      >
        update count2
      </button>
    </div>
  )
}

export default First
