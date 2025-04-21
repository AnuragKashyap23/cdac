import React from 'react'
import { Link, useNavigate } from 'react-router-dom'

function Navbar() {
  // get the navigate function reference
  const navigate = useNavigate()

  const onLogout = () => {
    // clear the token and user name from session storage
    sessionStorage.removeItem('token')
    sessionStorage.removeItem('name')

    // navigate to the login screen
    navigate('/')
  }

  return (
    <nav
      className='navbar navbar-expand-lg bg-primary'
      data-bs-theme='dark'
    >
      <div className='container-fluid'>
        <Link
          className='navbar-brand'
          to='/home'
        >
          Task Manager
        </Link>

        <div
          className='collapse navbar-collapse'
          id='navbarNav'
        >
          <ul className='navbar-nav'>
            <li className='nav-item'>
              <Link
                className='nav-link'
                aria-current='page'
                to='/home'
              >
                Home
              </Link>
            </li>
            <li className='nav-item'>
              <Link
                className='nav-link'
                aria-current='page'
                to='/task-list'
              >
                Tasks
              </Link>
            </li>
            <li className='nav-item'>
              <Link
                className='nav-link'
                aria-current='page'
                to='/add-task'
              >
                Add Task
              </Link>
            </li>
            <li className='nav-item'>
              <button
                onClick={onLogout}
                className='btn'
              >
                Logout
              </button>
            </li>
          </ul>
        </div>
      </div>
    </nav>
  )
}

export default Navbar
