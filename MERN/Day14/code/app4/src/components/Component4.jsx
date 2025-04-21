import { useState } from 'react'

function Component4() {
  // creating a state with a complex object
  const [userInfo, setUserInfo] = useState({
    firstName: '',
    lastName: '',
    email: '',
    phoneNumber: '',
  })

  const onRegister = () => {
    console.log(userInfo)
  }

  return (
    <>
      <h2>Component4</h2>

      <div>
        <div className='mb-3'>
          <label htmlFor=''>First Name</label>
          <input
            type='text'
            className='form-control'
            onChange={(e) => {
              setUserInfo({ ...userInfo, firstName: e.target.value })
            }}
          />
        </div>

        <div className='mb-3'>
          <label htmlFor=''>Last Name</label>
          <input
            type='text'
            className='form-control'
            onChange={(e) => {
              setUserInfo({ ...userInfo, lastName: e.target.value })
            }}
          />
        </div>

        <div className='mb-3'>
          <label htmlFor=''>Email</label>
          <input
            type='email'
            className='form-control'
            onChange={(e) => {
              setUserInfo({ ...userInfo, email: e.target.value })
            }}
          />
        </div>

        <div className='mb-3'>
          <label htmlFor=''>Phone number</label>
          <input
            type='tel'
            className='form-control'
            onChange={(e) => {
              setUserInfo({ ...userInfo, phoneNumber: e.target.value })
            }}
          />
        </div>

        <div className='mb-3'>
          <button
            onClick={onRegister}
            className='btn btn-success'
          >
            Register
          </button>
        </div>

        <div className='mb-3'>
          <div>first name = {userInfo.firstName}</div>
          <div>last name = {userInfo.lastName}</div>
          <div>email = {userInfo.email}</div>
          <div>phone = {userInfo.phoneNumber}</div>
        </div>
      </div>
    </>
  )
}

export default Component4
