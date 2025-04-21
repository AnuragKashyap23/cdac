import Component1 from './components/Component1'
import Component2 from './components/Component2'
import Component3 from './components/Component3'
import Component4 from './components/Component4'
import Component5 from './components/Component5'
import { ToastContainer } from 'react-toastify'

function App() {
  return (
    <div className='container'>
      <h1>App Component</h1>
      {/* <Component1 /> */}
      {/* <Component2 /> */}
      {/* <Component3 /> */}
      {/* <Component4 /> */}
      <Component5 />

      {/* needed to show the toast message */}
      <ToastContainer />
    </div>
  )
}

export default App
