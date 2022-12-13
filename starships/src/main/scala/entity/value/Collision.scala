package entity.value

import entity.Entity

case class Collision(leftEntity: Entity, rightEntity: Entity):
  def entityTypeCollision: EntityTypeCollision =
    EntityTypeCollision(leftEntity.entityType, rightEntity.entityType)
