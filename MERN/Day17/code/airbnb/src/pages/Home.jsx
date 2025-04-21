import React, { useEffect, useState } from 'react'
import { getAllProperties } from '../services/property'
import { toast } from 'react-toastify'
import Property from '../components/Property'

function Home() {
  // create a state to store all the properties
  const [properties, setProperties] = useState([])
  const [searchTerm, setSearchTerm] = useState('')

  // get all the properties
  const onGetAllProperties = async () => {
    const result = await getAllProperties(searchTerm)
    if (result['status'] == 'success') {
      setProperties(result['data'])
    } else {
      toast.error(result['error'])
    }
  }

  useEffect(() => {
    // load all properties
    onGetAllProperties()
  }, [])

  useEffect(() => {
    onGetAllProperties()
  }, [searchTerm])

  return (
    <div className='container'>
      <h1 className='page-header'>Home</h1>

      <div className='mb-3'>
        <input
          onChange={(e) => {
            setSearchTerm(e.target.value)
          }}
          type='text'
          placeholder='Search by title'
          className='form-control'
        />
        <button
          onClick={() => {
            setSearchTerm('')
            onGetAllProperties()
          }}
          className='mt-2 btn btn-success'
        >
          Reset Search
        </button>
      </div>

      {properties.length == 0 && (
        <h4 style={{ textAlign: 'center' }}>
          There are no properties at the moment
        </h4>
      )}

      {properties.length > 0 && (
        <div>
          <div className='row'>
            {properties.map((property) => {
              return (
                <Property
                  key={property['id']}
                  property={property}
                />
              )
            })}
          </div>
        </div>
      )}
    </div>
  )
}

export default Home
