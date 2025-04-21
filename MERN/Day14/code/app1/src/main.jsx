import { createRoot } from 'react-dom/client'

// import { App3 } from './App'

// import App as default function
// import App from './App'

// importing App with MyApp as alias
// import MyApp from './App'

// import App2 as non-default function
// import { App2 } from './App'

// import App2 with an alias named MyApp2
// mostly this is needed when there are multiple components with same name
// import { App2 as MyApp2 } from './App'

import App, { App2 as MyApp2, App3 as MyApp3 } from './App'

// get the root div
const div = document.getElementById('root')

// create the root to render the react component
const root = createRoot(div)

// render the first component
// root.render(App())
// root.render(<h1>...</h1>)
root.render(<MyApp2 />)
