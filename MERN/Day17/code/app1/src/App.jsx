import React from 'react'
import { Link, Route, Routes } from 'react-router-dom'
import First from './pages/First'
import Second from './pages/Second'
import Parent from './pages/Parent'
import Child1 from './pages/Child1'
import Child2 from './pages/Child2'

function App() {
  return (
    <div>
      <ul>
        <li>
          <Link to='/first'>First</Link>
        </li>
        <li>
          <Link to='/second'>Second</Link>
        </li>
        <li>
          <Link to='/parent'>Parent</Link>
        </li>
        <li>
          <Link to='/parent/child1'>Child1</Link>
        </li>
        <li>
          <Link to='/parent/child2'>Child2</Link>
        </li>
      </ul>

      <Routes>
        <Route
          path='first'
          element={<First />}
        />
        <Route
          path='second'
          element={<Second />}
        />
        <Route
          path='parent'
          element={<Parent />}
        >
          <Route
            path='child1'
            element={<Child1 />}
          />
          <Route
            path='child2'
            element={<Child2 />}
          />
        </Route>
      </Routes>
    </div>
  )
}

export default App
