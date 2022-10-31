package service.spawn

import collisionHandler.CollisionHandler
import dto.collidable.CollidableDTO
import dto.collision.CollisionDTO
import model.collidable.Collidable
import model.value.collision.Collision
import repository.collidable.CollidableRepository
import service.collidable.CollidableService

trait SpawnService(collidableService: CollidableService, collisionHandler: CollisionHandler):
  def spawnCollidable():List[Collidable]