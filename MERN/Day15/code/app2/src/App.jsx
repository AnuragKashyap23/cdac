import React from 'react'
import Login from './pages/Login'
import Register from './pages/Register'
import Home from './pages/Home'
import TaskList from './pages/TaskList'
import AddTask from './pages/AddTask'
import { Route, Routes } from 'react-router-dom'
import { ToastContainer } from 'react-toastify'

function App() {
  return (
    <div>
      <Routes>
        <Route
          path=''
          element={<Login />}
        />
        <Route
          path='register'
          element={<Register />}
        />
        <Route
          path='home'
          element={<Home />}
        />
        <Route
          path='task-list'
          element={<TaskList />}
        />
        <Route
          path='add-task'
          element={<AddTask />}
        />
      </Routes>

      <ToastContainer />
    </div>
  )
}

export default App
