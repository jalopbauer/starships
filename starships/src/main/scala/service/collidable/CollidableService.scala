package service.collidable

import dto.collision.CollisionDTO
import model.collidable.Collidable

trait CollidableService:
  def handleCollision(collisionsDTO: List[CollisionDTO]):List[Collidable]