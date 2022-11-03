package service.game

import collisionHandler.CollisionHandler
import dto.collidable.CollidableDTO
import dto.collision.CollisionDTO
import model.GameData
import model.collidable.{Asteroid, Collidable, Shot}
import model.value.collision.Collision
import repository.collidable.CollidableRepository
import service.collidable.CollidableService
import service.collision.CollisionService
import service.pointsService.PlayerPointsService
import service.spawn.SpawnService

trait GameService(collisionService: CollisionService
                  , spawnService: SpawnService, pointsService: PlayerPointsService):

  def handleCollision(gameData: GameData): GameData =
    val collidables: List[Collidable] = collisionService.handleCollision(gameData.collisions)
    gameData.put(collidables)


  def spawnCollidable():List[Collidable] =
    spawnService.spawnCollidable()