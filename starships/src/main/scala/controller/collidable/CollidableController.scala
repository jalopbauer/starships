package controller.collidable

import dto.collision.CollisionDTO
import service.collidable.CollidableService
import view.collidable.{CollidableView, CollidableViewTransformer}

trait CollidableController(collidableService: CollidableService, collideableViewTransformer: CollidableViewTransformer):
  def handleCollision(collisionsDTO: List[CollisionDTO]):List[CollidableView] =
    val postCollisionCollidables = collidableService.handleCollision(collisionsDTO)
    collideableViewTransformer.transform(postCollisionCollidables)
  def spawnCollidable():List[CollidableView]