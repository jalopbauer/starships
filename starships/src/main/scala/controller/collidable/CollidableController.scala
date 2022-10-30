package controller.collidable

import dto.collision.CollisionDTO
import service.collidable.CollidableService
import view.collidable.{CollidableView, CollidableViewTransformer}

trait CollidableController(collideableService: CollidableService, collideableViewTransformer: CollidableViewTransformer):
  def handleCollision(collisionsDTO: List[CollisionDTO]):List[CollidableView] =
    collideableService.handleCollision(collisionsDTO).map(collideableViewTransformer.transform)
  def spawnCollideable():List[CollidableView]