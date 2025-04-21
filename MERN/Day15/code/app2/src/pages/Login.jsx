import React, { useState } from 'react'
import { Link, useNavigate } from 'react-router-dom'
import { toast } from 'react-toastify'
import { loginUser } from '../services/user'

function Login() {
  const [email, setEmail] = useState('')
  const [password, setPassword] = useState('')

  // get the navigate function reference
  const navigate = useNavigate()

  const onLogin = async () => {
    if (email.length == 0) {
      toast.warn('Please enter email')
    } else if (password.length == 0) {
      toast.warn('Please enter password')
    } else {
      // make the API call
      const result = await loginUser(email, password)
      if (result['status'] == 'success') {
        toast.success('Welcome to task manager')

        // get the user info
        const { token, name } = result['data']
        sessionStorage.setItem('token', token)
        sessionStorage.setItem('name', name)

        // navigate to home screen
        navigate('/home')
      } else {
        toast.error(result['error'])
      }
    }
  }

  return (
    <div>
      <h1 className='page-header'>Login</h1>
      <div className='row'>
        <div className='col'></div>
        <div className='col'>
          <div>
            <div className='mb-3'>
              <label htmlFor=''>Email</label>
              <input
                onChange={(e) => {
                  setEmail(e.target.value)
                }}
                type='email'
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
              <div className='mb-3'>
                Don't have an account yet?
                <Link to='/register'>Register here</Link>
              </div>
              <button
                onClick={onLogin}
                className='btn btn-success'
              >
                Login
              </button>
            </div>
          </div>
        </div>
        <div className='col'></div>
      </div>
    </div>
  )
}

export default Login
