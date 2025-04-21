import React, { useEffect, useState } from 'react'
import { useLocation, useNavigate } from 'react-router-dom'
import { getPropertyDetails } from '../services/property'
import { toast } from 'react-toastify'
import { config } from '../services/config'
import './PropertyDetails.css'
import {
  Wifi,
  EggFried,
  PCircle,
  Fan,
  CupStraw,
  Tv,
  Water,
  Egg,
} from 'react-bootstrap-icons'

function PropertyDetails() {
  // set the property details in state
  const [details, setDetails] = useState()

  // get the location object
  const location = useLocation()

  // get the navigate function reference
  const navigate = useNavigate()

  // get the property details
  const loadPropertyDetails = async () => {
    const { id } = location.state
    const result = await getPropertyDetails(id)
    if (result['status'] == 'success') {
      setDetails(result['data'])
    } else {
      toast.error(result['error'])
    }
  }

  useEffect(() => {
    // read the metadata sent by previous component
    // console.log(`Property details of: `, location.state)
    loadPropertyDetails()
  }, [])

  const getImageUrl = () => {
    return `${config.serverUrl}/${details['profileImage']}`
  }

  return (
    <div className='container mb-5'>
      {!details && <h2>loading details...</h2>}
      {details && (
        <div>
          <div className='row'>
            <div className='col'>
              <h2 className='mt-3 mb-3'>{details['title']}</h2>
              <img
                src={getImageUrl()}
                alt=''
                style={{ width: '100%', maxHeight: 400 }}
              />
            </div>
          </div>
          <div className='row mt-3'>
            <div
              style={{ fontWeight: 'bold', fontSize: 20 }}
              className='col'
            >
              {details['address']}
            </div>
          </div>
          <div className='row'>
            <div
              className='col'
              style={{ fontSize: 18 }}
            >
              {details['guests']} guests | {details['bedrooms']} bedrooms |{' '}
              {details['beds']} beds | {details['bathrooms']} bathrooms
            </div>
          </div>

          <div className='row'>
            <div className='col'>
              <div className='row mt-5 mb-3'>
                <div
                  style={{ fontSize: 20 }}
                  className='col'
                >
                  {details['details']}
                </div>
              </div>

              <h3 className='mt-2 mb-3'>What this place offers</h3>
              <div className='row mb-5'>
                <div className='col'>
                  <ul
                    className=''
                    style={{ listStyleType: 'none' }}
                  >
                    {details['isLakeView'] == 1 && (
                      <li className=''>
                        <Water /> <span>Lake Access</span>
                      </li>
                    )}
                    {details['isTV'] == 1 && (
                      <li className=''>
                        <Tv /> <span>TV Access</span>
                      </li>
                    )}
                    {details['isAC'] == 1 && (
                      <li className=''>
                        <Fan /> <span>Air Conditioner</span>
                      </li>
                    )}
                    {details['isWifi'] == 1 && (
                      <li className=''>
                        <Wifi /> <span>WiFi Access</span>
                      </li>
                    )}
                    {details['isMiniBar'] == 1 && (
                      <li className=''>
                        <CupStraw /> <span>Minibar Access</span>
                      </li>
                    )}
                    {details['isBreakfast'] == 1 && (
                      <li className=''>
                        <EggFried /> <span>Breakfast Available</span>
                      </li>
                    )}
                    {details['isParking'] == 1 && (
                      <li className=''>
                        <PCircle /> <span>Parking Available</span>
                      </li>
                    )}
                  </ul>
                </div>
              </div>
              <div className='row'>
                <div className='col'>
                  <button
                    onClick={() => navigate(-1)}
                    className='btn btn-danger'
                  >
                    Back
                  </button>
                </div>
              </div>
            </div>
            <div className='col-3'>
              <div className='booking-container'>
                <div className='mb-3'>
                  <label htmlFor=''>Check In</label>
                  <input
                    type='date'
                    className='form-control'
                  />
                </div>
                <div className='mb-3'>
                  <label htmlFor=''>Check Out</label>
                  <input
                    type='date'
                    className='form-control'
                  />
                </div>
                <div className='mb-3'>
                  <button className='btn btn-success'>Book</button>
                </div>
              </div>
            </div>
          </div>
        </div>
      )}
    </div>
  )
}

export default PropertyDetails
