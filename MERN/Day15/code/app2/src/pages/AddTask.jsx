import React, { useEffect, useState } from 'react'
import Navbar from '../components/Navbar'
import { toast } from 'react-toastify'
import { createTask } from '../services/tasks'
import { useNavigate } from 'react-router-dom'

function AddTask() {
  const [info, setInfo] = useState({
    title: '',
    description: '',
  })

  useEffect(() => {
    console.log(`AddTask is mounted`)

    return () => {
      console.log(`AddTask is unmounted`)
    }
  }, [])

  // get the navigate function reference
  const navigate = useNavigate()

  const onAdd = async () => {
    if (info.title.length == 0) {
      toast.warn('Please enter title')
    } else if (info.description.length == 0) {
      toast.warn('Please enter description')
    } else {
      // make the post API
      const result = await createTask(info.title, info.description)
      if (result['status'] == 'success') {
        toast.success('Successfully added a task')

        // redirect to the home screen
        navigate('/home')
      } else {
        toast.error(result['error'])
      }
    }
  }

  return (
    <div>
      <Navbar />
      <h1 className='page-header'>Add Task</h1>

      <div className='container'>
        <div className='mb-3'>
          <label htmlFor=''>Title</label>
          <input
            onChange={(e) => {
              setInfo({ ...info, title: e.target.value })
            }}
            type='text'
            className='form-control'
          />
        </div>

        <div className='mb-3'>
          <label htmlFor=''>Description</label>
          <textarea
            onChange={(e) => {
              setInfo({ ...info, description: e.target.value })
            }}
            rows={10}
            className='form-control'
          ></textarea>
        </div>

        <div className='mb-3'>
          <button
            onClick={onAdd}
            className='btn btn-success'
          >
            Add
          </button>
        </div>
      </div>
    </div>
  )
}

export default AddTask
