function App() {
  // simple variables
  const firstName = 'steve'
  const lastName = 'jobs'

  // object
  const car = {
    model: 'triber',
    company: 'renault',
    price: 10,
  }

  // array of strings
  const countries = ['india', 'usa', 'uk', 'japan']

  // array of objects
  const laptops = [
    { model: 'macbook pro', company: 'apple' },
    { model: 'alienware', company: 'dell' },
    { model: 'thinkpad', company: 'lenovo' },
  ]

  return (
    <div>
      <h3>rendering simple variables</h3>
      <div>first name = {firstName}</div>
      <div>last name = {lastName}</div>
      <hr />

      <h3>rendering an object</h3>
      <div>model = {car.model}</div>
      <div>company = {car.company}</div>
      <div>price = {car['price']}</div>
      <hr />

      <h3>rendering an array of strings</h3>
      {countries.map((countryName) => {
        return <div>{countryName}</div>
      })}
      <hr />

      <h3>rendering array of objects</h3>
      {laptops.map((laptop) => {
        return (
          <div>
            <div>model = {laptop.model} </div>
            <div>company = {laptop.company} </div>
            <hr />
          </div>
        )
      })}
    </div>
  )
}

export default App
