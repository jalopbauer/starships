package service.collidable

import collisionHandler.CollisionHandler
import dto.collision.CollisionDTO
import dto.collidable.CollidableDTO
import model.collidable.Collidable
import model.value.collision.Collision
import repository.collidable.CollidableRepository

trait CollidableService(collidableRepository: CollidableRepository, collisionHandler: CollisionHandler):
  def handleCollision(collisionsDTO: List[CollisionDTO]):List[Collidable] =
    val collisions = collisionsDTO.map(collisionDTO =>
      Collision(findById(collisionDTO.collidableDTO1),
        findById(collisionDTO.collidableDTO2)))
    val postCollision = collisions.map(collisionHandler.handleCollision)
    postCollision.foldRight(List():List[Collidable])((collision,acc) => List(collision.rightCollidable,collision.leftCollidable) ::: acc)
  def findById(collisionDTO: CollidableDTO): Collidable =
    collidableRepository.findById(collisionDTO.id)
  def spawnCollidable(): List[Collidable]