import React from 'react'
import { Link, useNavigate } from 'react-router-dom'

function Register() {
  // get the navigation function reference
  const navigate = useNavigate()

  // event handler
  const onRegister = () => {
    // input validations
    // make an API call
    // redirect to Login screen
    navigate('/')
  }

  return (
    <div>
      <h1 className='page-header'>Register</h1>

      <div className='row'>
        <div className='col'></div>
        <div className='col'>
          <div className='mb-3'>
            <label htmlFor=''>First Name</label>
            <input
              type='text'
              className='form-control'
            />
          </div>
          <div className='mb-3'>
            <label htmlFor=''>Last Name</label>
            <input
              type='text'
              className='form-control'
            />
          </div>
          <div className='mb-3'>
            <label htmlFor=''>Email</label>
            <input
              type='email'
              className='form-control'
            />
          </div>
          <div className='mb-3'>
            <label htmlFor=''>Phone Number</label>
            <input
              type='tel'
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
            <label htmlFor=''>Confirm Password</label>
            <input
              type='password'
              className='form-control'
            />
          </div>

          <div className='mb-3'>
            <div className='mb-3'>
              Already have an account? <Link to='/'>Login here</Link>
            </div>
            <button
              onClick={onRegister}
              className='btn btn-success'
            >
              Register
            </button>
          </div>
        </div>
        <div className='col'></div>
      </div>
    </div>
  )
}

export default Register
