package service.collidable

import dto.collision.CollisionDTO
import dto.collidable.CollidableDTO
import model.collidable.Collidable
import model.value.collision.Collision
import repository.collidable.CollidableRepository

trait CollidableService(collidableRepository: CollidableRepository):
  def handleCollision(collisionsDTO: List[CollisionDTO]):List[Collidable] =
    val collisions = collisionsDTO.map(collisionDTO =>
      Collision(findById(collisionDTO.collidableDTO1),
        findById(collisionDTO.collidableDTO2)))
    List()

  def findById(collisionDTO: CollidableDTO): Collidable =
    collidableRepository.findById(collisionDTO.id)
  def spawnCollidable(): List[Collidable]