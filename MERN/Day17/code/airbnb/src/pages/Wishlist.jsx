import React from 'react'
import { useSelector } from 'react-redux'
import Property from '../components/Property'
import WishlistItem from '../components/WislistItem'

function Wishlist() {
  const items = useSelector((store) => store.wishlist.items)

  return (
    <div className='container'>
      <h1 className='page-header'>Wishlist</h1>
      {items.length == 0 && (
        <h4 style={{ textAlign: 'center' }}>
          There are no properties at the moment
        </h4>
      )}

      {items.length > 0 && (
        <div>
          <div className='row'>
            {items.map((property) => {
              return (
                <WishlistItem
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

export default Wishlist
