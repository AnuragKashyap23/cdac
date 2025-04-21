import { useState } from 'react'
import { toast } from 'react-toastify'

function Component5() {
  const [countries, setCountries] = useState([])
  const [country, setCountry] = useState('')

  const onAdd = () => {
    if (country.length == 0) {
      toast.error('Enter country name first')
    } else {
      setCountries([...countries, country])
    }
  }

  return (
    <>
      <h3>Component 5</h3>
      <div className='mb-3'>
        <label htmlFor=''>Country Name</label>
        <input
          onChange={(e) => {
            setCountry(e.target.value)
          }}
          type='text'
          className='form-control'
        />
      </div>
      <div className='mb-3'>
        <button
          onClick={onAdd}
          className='btn btn-success'
        >
          Add
        </button>
      </div>

      <div>
        {countries.map((country) => {
          return <div>{country} </div>
        })}
      </div>
    </>
  )
}

export default Component5
