import React, { useEffect, useState } from 'react'
import Navbar from '../components/Navbar'
import { deleteTask, getTasks } from '../services/tasks'
import { toast } from 'react-toastify'

function TaskList() {
  // create a state member for task list
  const [tasks, setTasks] = useState([])

  // get all tasks created by the user
  const getUserTasks = async () => {
    const result = await getTasks()
    if (result['status'] == 'success') {
      setTasks(result['data'])
    } else {
      toast.error(result['error'])
    }
  }

  // take an action when the component is mounted
  useEffect(() => {
    console.log(`TaskList is mounted`)
    getUserTasks()

    return () => {
      console.log(`TaskList is unmounted`)
    }
  }, [])

  const onDeleteTask = async (id) => {
    const result = await deleteTask(id)
    if (result['status'] == 'success') {
      toast.success('Successfully deleted the task')

      // refresh the screen
      getUserTasks()
    } else {
      toast.error(result['error'])
    }
  }

  return (
    <div>
      <Navbar />
      <h1 className='page-header'>Task List</h1>

      <div className='container'>
        {tasks.length == 0 && (
          <h4>There are not task at the moment. Please add a new task.</h4>
        )}

        {tasks.length > 0 && (
          <table className='table table-stripped'>
            <thead>
              <tr>
                <th>No</th>
                <th>Title</th>
                <th>Description</th>
                <th>Actions</th>
              </tr>
            </thead>
            <tbody>
              {tasks.map((task, index) => {
                return (
                  <tr key={task['id']}>
                    <td>{index + 1}</td>
                    <td>{task['title']}</td>
                    <td>{task['description']}</td>
                    <td>
                      <button
                        onClick={() => {
                          onDeleteTask(task['id'])
                        }}
                        className='btn btn-danger btn-sm'
                      >
                        delete
                      </button>
                    </td>
                  </tr>
                )
              })}
            </tbody>
          </table>
        )}
      </div>
    </div>
  )
}

export default TaskList
