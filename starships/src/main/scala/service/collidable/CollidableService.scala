package service.collidable

import collisionHandler.CollisionHandler
import dto.collision.CollisionDTO
import dto.collidable.{CollidableCreationDTO, CollidableDTO}
import model.collidable.Collidable
import model.value.collision.Collision
import repository.collidable.CollidableRepository

trait CollidableService(collidableRepository: CollidableRepository, collisionHandler: CollisionHandler):
  def findById(collisionDTO: CollidableDTO): Collidable =
    collidableRepository.findById(collisionDTO.id)

  def create(collidable: CollidableCreationDTO):Collidable