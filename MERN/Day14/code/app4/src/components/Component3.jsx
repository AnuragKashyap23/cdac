import { useState } from 'react'
import { toast } from 'react-toastify'

function Component3() {
  // state member for email
  const [email, setEmail] = useState('')
  const [password, setPassword] = useState('')

  const onLogin = () => {
    // input validation
    if (email.length == 0) {
      toast.error('enter email address')
    } else if (password.length == 0) {
      toast.error('enter password')
    } else {
      console.log(`email = ${email}`)
      console.log(`password = ${password}`)
    }
  }

  return (
    <>
      <h2>Component 3</h2>

      <div>
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
    </>
  )
}

export default Component3
