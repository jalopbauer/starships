package service.game

import collisionHandler.CollisionHandler
import dto.collidable.CollidableDTO
import dto.collision.CollisionDTO
import model.collidable.{Asteroid, Collidable, Shot}
import model.value.collision.Collision
import repository.collidable.CollidableRepository
import service.collidable.CollidableService
import service.collision.CollisionService
import service.pointsService.PlayerPointsService
import service.spawn.SpawnService

trait GameService(collisionService: CollisionService
                  , spawnService: SpawnService, pointsService: PlayerPointsService):

  def handleCollision(collisionsDTO: List[CollisionDTO]):List[Collidable] =
    val collisions = collisionService.collisions(collisionsDTO)
    

    collisionService.handleCollision(collisions)

  def spawnCollidable():List[Collidable] =
    spawnService.spawnCollidable()