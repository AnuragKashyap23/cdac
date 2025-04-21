function SimpleComponent({ name, age, email, address }) {
  return (
    <div>
      <div>name = {name}</div>
      <div>age = {age}</div>
      <div>email = {email}</div>
      <div>address = {address}</div>
      <hr />
    </div>
  )
}

// function SimpleComponent(props) {
//   const { name, age, email } = props
//   return (
//     <div>
//       <div>name = {name}</div>
//       <div>age = {age}</div>
//       <div>email = {email}</div>
//       <hr />
//     </div>
//   )
// }

// function SimpleComponent(props) {
//   console.log(`props = `, props)
//   return (
//     <div>
//       <div>name = {props.name}</div>
//       <div>age = {props.age}</div>
//       <div>email = {props.email}</div>
//     </div>
//   )
// }

export default SimpleComponent
