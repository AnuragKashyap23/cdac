import React, { useContext } from 'react'
import { AuthContext } from '../App'

function Home() {
  // get the user from AuthContext
  const { user } = useContext(AuthContext)

  return (
    <div>
      <h1>Home</h1>
      <div>
        Welcome {user.firstName} {user.lastName}
      </div>
    </div>
  )
}

export default Home
