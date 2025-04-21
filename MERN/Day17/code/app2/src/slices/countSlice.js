import { createSlice } from '@reduxjs/toolkit'

// create a slice to store the count value
const countSlice = createSlice({
  name: 'countSlice',
  initialState: {
    count: 10,
  },
  reducers: {
    increment: (state) => {
      state.count += 1
      // return state
    },

    decrement: (state) => {
      state.count -= 1
      // return state
    },
  },
})

// export all the actions
export const { increment, decrement } = countSlice.actions

// export all the reducer function
export default countSlice.reducer
