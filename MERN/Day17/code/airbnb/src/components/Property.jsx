import React from 'react'
import { config } from '../services/config'
import { addItem } from '../slices/wishlistSlice'
import { useDispatch } from 'react-redux'
import { useNavigate } from 'react-router-dom'

function Property({ property }) {
  // create the image url
  const imageUrl = `${config.serverUrl}/${property['profileImage']}`

  // get the short description
  const shortDescription = () => {
    if (property['details'].length > 50) {
      return property['details'].substring(0, 50) + '...'
    } else {
      return property['details']
    }
  }

  // get the dispatch function reference
  const dispatch = useDispatch()

  const onAddItemToWishlist = () => {
    // call the addItem reducer by sending the action
    dispatch(addItem(property))
  }

  // get the navigate function reference
  const navigate = useNavigate()

  const onDetails = () => {
    // navigate to property details
    // and carry the property id along with
    navigate('/container/property-details', {
      state: {
        id: property['id'],
      },
    })
  }

  return (
    <div className='col-3'>
      <div
        className='card'
        style={{ height: 400 }}
      >
        <img
          src={imageUrl}
          className='card-img-top'
        />
        <div className='card-body'>
          <div className='card-title'>{property['title']}</div>
          <div className='card-text'>{shortDescription()}</div>
          <div style={{ fontWeight: 'bold' }}>₹ {property['rent']}</div>
          <div style={{ position: 'absolute', bottom: 10, right: 10 }}>
            <button
              onClick={onDetails}
              className='btn btn-warning btn-sm'
            >
              details
            </button>
            <button
              onClick={onAddItemToWishlist}
              className='btn btn-success btn-sm ms-2'
            >
              wishlist
            </button>
          </div>
        </div>
      </div>
    </div>
  )
}

export default Property
