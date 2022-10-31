package service.collision

import collisionHandler.CollisionHandler
import dto.collidable.CollidableDTO
import dto.collision.CollisionDTO
import model.collidable.Collidable
import model.value.collision.Collision
import repository.collidable.CollidableRepository
import service.collidable.CollidableService

trait CollisionService(collidableService: CollidableService, collisionHandler: CollisionHandler):
  def handleCollision(collisionsDTO: List[CollisionDTO]):List[Collidable] =
    val collisions = collisionsDTO.map(collisionDTO =>
      Collision(collidableService.findById(collisionDTO.collidableDTO1),
        collidableService.findById(collisionDTO.collidableDTO2)))
    val postCollision = collisions.map(collisionHandler.handleCollision)
    postCollision.foldRight(List():List[Collidable])((collision,acc) => List(collision.rightCollidable,collision.leftCollidable) ::: acc)