function Component1() {
  // function: click event handler
  const onButtonClick = (event) => {
    alert(`onButtonClick called..`)
    console.log(event)
  }

  // function: text change event handler
  const onTextChange = (event) => {
    // get input from user by using event object
    const value = event.target.value
    console.log('text changed: ', value)
  }

  return (
    <div>
      <h2>Component 1</h2>
      <input
        onChange={onTextChange}
        type='text'
      />
      <button onClick={onButtonClick}>click here</button>
    </div>
  )
}

export default Component1
