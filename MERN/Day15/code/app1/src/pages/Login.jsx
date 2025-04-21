import React from 'react'
import { Link } from 'react-router-dom'

function Login() {
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
                type='email'
                className='form-control'
              />
            </div>
            <div className='mb-3'>
              <label htmlFor=''>Password</label>
              <input
                type='password'
                className='form-control'
              />
            </div>
            <div className='mb-3'>
              <div className='mb-3'>
                Don't have an account yet?
                <Link to='/register'>Register here</Link>
              </div>
              <button className='btn btn-success'>Login</button>
            </div>
          </div>
        </div>
        <div className='col'></div>
      </div>
    </div>
  )
}

export default Login
