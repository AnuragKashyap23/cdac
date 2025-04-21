const express = require('express')
const router = express.Router()
const db = require('../db/db')
const result = require('../utils/result')

router.get('/', (request, response) => {
  const statement = `
        SELECT id, title, description, status, createdTimestamp
        FROM tasks
        WHERE userId = ? 
    `
  db.query(statement, [request.userId], (error, tasks) => {
    response.send(result.createResult(error, tasks))
  })
})

router.post('/', (request, response) => {
  const { title, description } = request.body

  const statement = `
        INSERT INTO tasks(
            title, description, status, userId
        ) VALUES(
            ?, ?, ?, ?
        )
    `
  db.execute(
    statement,
    [title, description, 'pending', request.userId],
    (error, data) => {
      response.send(result.createResult(error, data))
    }
  )
})

router.delete('/:id', (request, response) => {
  const { id } = request.params

  const statement = `
        DELETE FROM tasks
        WHERE id = ? and userId = ?
    `
  db.execute(statement, [id, request.userId], (error, data) => {
    response.send(result.createResult(error, data))
  })
})

router.put('/:id', (request, response) => {
  const { id } = request.params
  const { title, description } = request.body

  const statement = `
        UPDATE tasks 
        SET
            title = ?,  description = ?
        WHERE
            id = ? and userId = ?
    `
  db.execute(
    statement,
    [title, description, id, request.userId],
    (error, data) => {
      response.send(result.createResult(error, data))
    }
  )
})

router.patch('/status/:id/:status', (request, response) => {
  const { id, status } = request.params

  const statement = `
        UPDATE tasks 
        SET
            status = ?
        WHERE
            id = ? and userId = ?
    `
  db.execute(statement, [status, id, request.userId], (error, data) => {
    response.send(result.createResult(error, data))
  })
})

module.exports = router
