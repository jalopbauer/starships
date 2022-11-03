package service.collision

import collisionHandler.CollisionHandler
import dto.collidable.CollidableDTO
import dto.collision.CollisionDTO
import model.collidable.Collidable
import model.value.collision.Collision
import repository.collidable.CollidableRepository
import service.collidable.CollidableService

trait CollisionService(collisionHandler: CollisionHandler):
  def handleCollision(collisions: List[Collision]):List[Collidable] =
    val postCollision = collisions.map(collisionHandler.handleCollision)
    postCollision.foldRight(List():List[Collidable])((collision,acc) => List(collision.rightCollidable,collision.leftCollidable) ::: acc)