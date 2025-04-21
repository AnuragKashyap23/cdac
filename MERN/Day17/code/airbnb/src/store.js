import { configureStore } from '@reduxjs/toolkit'
import wishlistSlice from './slices/wishlistSlice'

// create a store
const store = configureStore({
  reducer: {
    wishlist: wishlistSlice,
  },
})

export default store
