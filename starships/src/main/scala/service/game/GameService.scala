package service.game

import collisionHandler.CollisionHandler
import dto.collidable.CollidableDTO
import dto.collision.CollisionDTO
import model.collidable.Collidable
import model.value.collision.Collision
import repository.collidable.CollidableRepository
import service.collidable.CollidableService
import service.collision.CollisionService
import service.spawn.SpawnService

trait GameService(collisionService: CollisionService
                  , spawnService: SpawnService):

  def handleCollision(collisionsDTO: List[CollisionDTO]):List[Collidable] =
    collisionService.handleCollision(collisionsDTO)

  def spawnCollidable():List[Collidable] =
    spawnService.spawnCollidable()