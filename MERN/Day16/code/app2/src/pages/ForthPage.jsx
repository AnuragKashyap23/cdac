import React, { useContext } from 'react'
import { MyContext, NumContext } from '../App'

function ForthPage() {
  const myContext = useContext(MyContext)
  const numContext = useContext(NumContext)

  return (
    <div>
      <h1 className='page-header'>Forth Component</h1>
      <h3>
        Count = {myContext ? myContext.count : 'my context is not available'}
      </h3>
      <h3>
        Count ={' '}
        {numContext ? numContext.number : 'num context is not available'}
      </h3>
    </div>
  )
}

export default ForthPage
