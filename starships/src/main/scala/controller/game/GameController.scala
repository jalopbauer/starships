package controller.collidable

import dto.collision.CollisionDTO
import service.game.GameService
import view.collidable.{CollidableView, CollidableViewTransformer}

trait GameController(gameService: GameService
                     , collideableViewTransformer: CollidableViewTransformer):
  def handleCollision(collisionsDTO: List[CollisionDTO]):List[CollidableView] =
    val postCollisionCollidables = gameService.handleCollision(collisionsDTO)
    collideableViewTransformer.transform(postCollisionCollidables)
    
  def spawnCollidable():List[CollidableView] =
    val spawnCollidables = gameService.spawnCollidable()
    collideableViewTransformer.transform(spawnCollidables)