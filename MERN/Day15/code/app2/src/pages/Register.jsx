import React, { useState } from 'react'
import { Link, useNavigate } from 'react-router-dom'
import { toast } from 'react-toastify'
import { registerUser } from '../services/user'

function Register() {
  const [userInfo, setUserInfo] = useState({
    firstName: '',
    lastName: '',
    email: '',
    phone: '',
    password: '',
    confirmPassword: '',
  })

  // get the navigation function reference
  const navigate = useNavigate()

  // event handler
  const onRegister = async () => {
    // input validations
    if (userInfo.firstName.length == 0) {
      toast.warn('Please enter first name')
    } else if (userInfo.lastName.length == 0) {
      toast.warn('Please enter last name')
    } else if (userInfo.email.length == 0) {
      toast.warn('Please enter email')
    } else if (userInfo.phone.length == 0) {
      toast.warn('Please enter phone number')
    } else if (userInfo.password.length == 0) {
      toast.warn('Please enter password')
    } else if (userInfo.confirmPassword.length == 0) {
      toast.warn('Please confirm password')
    } else if (userInfo.password != userInfo.confirmPassword) {
      toast.warn('Password does not match')
    } else {
      // make an API call
      const { firstName, lastName, email, phone, password } = userInfo
      const result = await registerUser(
        firstName,
        lastName,
        email,
        password,
        phone
      )

      // check the result
      if (result['status'] == 'success') {
        toast.success('Successfully registered new user')

        // redirect to Login screen
        navigate('/')
      } else {
        toast.error(result['error'])
      }
    }
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
              onChange={(e) => {
                setUserInfo({ ...userInfo, firstName: e.target.value })
              }}
              type='text'
              className='form-control'
            />
          </div>
          <div className='mb-3'>
            <label htmlFor=''>Last Name</label>
            <input
              onChange={(e) => {
                setUserInfo({ ...userInfo, lastName: e.target.value })
              }}
              type='text'
              className='form-control'
            />
          </div>
          <div className='mb-3'>
            <label htmlFor=''>Email</label>
            <input
              onChange={(e) => {
                setUserInfo({ ...userInfo, email: e.target.value })
              }}
              type='email'
              className='form-control'
            />
          </div>
          <div className='mb-3'>
            <label htmlFor=''>Phone Number</label>
            <input
              onChange={(e) => {
                setUserInfo({ ...userInfo, phone: e.target.value })
              }}
              type='tel'
              className='form-control'
            />
          </div>
          <div className='mb-3'>
            <label htmlFor=''>Password</label>
            <input
              onChange={(e) => {
                setUserInfo({ ...userInfo, password: e.target.value })
              }}
              type='password'
              className='form-control'
            />
          </div>
          <div className='mb-3'>
            <label htmlFor=''>Confirm Password</label>
            <input
              onChange={(e) => {
                setUserInfo({ ...userInfo, confirmPassword: e.target.value })
              }}
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
