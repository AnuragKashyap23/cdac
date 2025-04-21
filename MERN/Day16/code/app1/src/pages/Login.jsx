import React, { useContext, useState } from 'react'
import { useNavigate } from 'react-router-dom'
import { AuthContext } from '../App'

function Login() {
  const [email, setEmail] = useState('')
  const [password, setPassword] = useState('')

  // get the context info
  const { setUser } = useContext(AuthContext)

  // get the navigate function reference
  const navigate = useNavigate()

  const onLogin = () => {
    if (email == 'test@test.com' && password == 'test') {
      // user is successfully logged in

      // share the user info with all the components
      setUser({
        token: 'dummy-token',
        firstName: 'John',
        lastName: 'Doe',
        email: 'john.doe@test.com',
      })

      // redirect to home component
      navigate('/home')
    } else {
      alert('invalid email or password')
    }
  }

  return (
    <div>
      <h1 className='page-header'>Login</h1>

      <div className='container'>
        <div className='mb-3'>
          <label htmlFor=''>Email</label>
          <input
            onChange={(e) => {
              setEmail(e.target.value)
            }}
            type='text'
            className='form-control'
          />
        </div>
        <div className='mb-3'>
          <label htmlFor=''>Password</label>
          <input
            onChange={(e) => {
              setPassword(e.target.value)
            }}
            type='password'
            className='form-control'
          />
        </div>
        <div className='mb-3'>
          <button
            onClick={onLogin}
            className='btn btn-success'
          >
            Login
          </button>
        </div>
      </div>
    </div>
  )
}

export default Login
