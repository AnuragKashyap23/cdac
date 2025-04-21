import React from 'react'
import { Outlet } from 'react-router-dom'

function Parent() {
  return (
    <div>
      <h1 className='page-header'>Parent</h1>
      <Outlet />
    </div>
  )
}

export default Parent
