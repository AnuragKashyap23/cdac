import React, { createContext, useState } from 'react'
import { Link, Route, Routes } from 'react-router-dom'
import FirstPage from './pages/FirstPage'
import SecondPage from './pages/SecondPage'
import ThirdPage from './pages/ThirdPage'
import ForthPage from './pages/ForthPage'
import FifthPage from './pages/FifthPage'

// create a context to share the data with all components
export const MyContext = createContext()
export const NumContext = createContext()

function App() {
  const [count, setCount] = useState(0)
  const [number, setNumber] = useState(100)

  return (
    <div>
      <div className='row'>
        <NumContext.Provider value={{ number, setNumber }}>
          <MyContext.Provider value={{ count, setCount }}>
            <div className='col'>
              <FirstPage />
            </div>
            <div className='col'>
              <SecondPage />
            </div>
            <div className='col'>
              <ThirdPage />
            </div>
          </MyContext.Provider>

          <div className='col'>
            <ForthPage />
          </div>
        </NumContext.Provider>

        <div className='col'>
          <FifthPage
            count={count}
            setCount={setCount}
          />
        </div>
      </div>

      {/* <ul>
        <li>
          <Link to='/first'>First</Link>
        </li>
        <li>
          <Link to='/second'>Second</Link>
        </li>
        <li>
          <Link to='/third'>Third</Link>
        </li>
        <li>
          <Link to='/forth'>Forth</Link>
        </li>
        <li>
          <Link to='/fifth'>Fifth</Link>
        </li>
      </ul> */}

      {/* <MyContext.Provider value={{ count, setCount }}>
        <Routes>
          <Route
            path='first'
            element={<FirstPage />}
          />
          <Route
            path='second'
            element={<SecondPage />}
          />
          <Route
            path='third'
            element={<ThirdPage />}
          />

          <Route
            path='forth'
            element={<ForthPage />}
          />
          <Route
            path='fifth'
            element={<FifthPage />}
          />
        </Routes>
      </MyContext.Provider> */}
    </div>
  )
}

export default App
