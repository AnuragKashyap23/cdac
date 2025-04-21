import { createSlice } from '@reduxjs/toolkit'

// create a slice to manage the count value
const myCountSlice = createSlice({
  name: 'myCountSlice',
  initialState: {
    value: 0,
  },
  reducers: {
    increment: (state) => {
      state.value += 1
    },
    decrement: (state) => {
      state.value -= 1
    },
  },
})

// exporting actions
export const { increment, decrement } = myCountSlice.actions

// exporting the reducer object of myCountSlice
export default myCountSlice.reducer
