import { createSlice } from '@reduxjs/toolkit'
import { toast } from 'react-toastify'

// create a store
const wishlistSlice = createSlice({
  name: 'wishlist',
  initialState: {
    items: [],
  },
  reducers: {
    addItem: (state, action) => {
      // since the state.items is an array, we need to create an object
      // everytime using ...
      // action.payload will be received as the property to be added
      // to the wishlist

      // ...state.items will NOT create a new object of state
      // rather it will create a new object for items in state

      // check if the property is added to the items list
      const index = state.items.findIndex(
        (item) => item['id'] == action.payload['id']
      )
      if (index == -1) {
        // the new item does not exist in the state
        state.items = [...state.items, action.payload]

        toast.success('Successfully added to the wishlist')
      } else {
        toast.error('This property already exists in your wishlist')
      }
    },
    removeItem: (state, action) => {
      // get the index position of the property to be removed
      const index = state.items.findIndex(
        (item) => item['id'] == action.payload['id']
      )
      if (index == -1) {
        toast.error('Property does not exist')
      } else {
        // select all the items except the one to be removed
        state.items = state.items.filter(
          (item) => item['id'] != action.payload['id']
        )
      }
    },
  },
})

// export actions
export const { addItem, removeItem } = wishlistSlice.actions

// export reducer
export default wishlistSlice.reducer
