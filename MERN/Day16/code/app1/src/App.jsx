import React, { createContext, useState } from 'react'
import { Route, Routes } from 'react-router-dom'
import Login from './pages/Login'
import AddTask from './pages/AddTask'
import TaskList from './pages/TaskList'
import Home from './pages/Home'

// create a context
// - used to share the logged in user's information
export const AuthContext = createContext()

function App() {
  // {
  //   firstName: '',
  //   lastName: '',
  //   token: '',
  // }
  const [user, setUser] = useState(null)

  return (
    <div>
      <AuthContext.Provider value={{ user, setUser }}>
        <Routes>
          <Route
            path='/'
            element={<Login />}
          />

          <Route
            path='home'
            element={<Home />}
          />

          <Route
            path='add-task'
            element={<AddTask />}
          />

          <Route
            path='task-list'
            element={<TaskList />}
          />
        </Routes>
      </AuthContext.Provider>
    </div>
  )
}

export default App
