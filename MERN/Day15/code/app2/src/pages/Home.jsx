import React, { useEffect } from 'react'
import Navbar from '../components/Navbar'

function Home() {
  useEffect(() => {
    console.log(`Home is mounted`)

    return () => {
      console.log(`Home is unmounted`)
    }
  }, [])

  return (
    <div>
      <Navbar />
      <h1 className='page-header'>Home</h1>
    </div>
  )
}

export default Home
