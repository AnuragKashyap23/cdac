import { configureStore } from '@reduxjs/toolkit'
import myCountSlice from '../slices/myCountSlice'

// create a store
const store = configureStore({
  reducer: {
    myCountSlice: myCountSlice,
  },
})

export default store
