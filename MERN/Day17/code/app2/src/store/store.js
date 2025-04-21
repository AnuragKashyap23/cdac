import { configureStore } from '@reduxjs/toolkit'
import countReducer from '../slices/countSlice'

// global store
const store = configureStore({
  reducer: {
    // add the count reducer into the store
    countSlice: countReducer,
  },
})

// export the global store
export default store
