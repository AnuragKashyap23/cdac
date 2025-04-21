import SimpleComponent from './components/simpleComponent'
import Car from './components/Car'

function App() {
  const cars = [
    { company: 'car1', model: 'model1', year: 2020 },
    { company: 'car2', model: 'model2', year: 2021 },
    { company: 'car3', model: 'model3', year: 2022 },
  ]

  return (
    <div>
      <h1>App Component</h1>
      <SimpleComponent
        name='person1'
        age='20'
        email='person1@test.com'
        address='pune'
      />
      <SimpleComponent
        name='person2'
        age='40'
        email='person2@test.com'
        address='mumbai'
      />
      <hr />
      <hr />

      <h3>Cars Array</h3>
      {cars.map((car, index) => {
        return (
          <Car
            key={index}
            company={car.company}
            model={car.model}
            year={car.year}
          />
        )
      })}
    </div>
  )
}

export default App
