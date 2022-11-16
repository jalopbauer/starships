package gameData

case class Collision(leftEntity: Entity, rightEntity: Entity):
  def getEntityTypeTuple:(EntityType, EntityType) =
    (leftEntity.entityType, rightEntity.entityType)
  def inverse: Collision = this.copy(rightEntity, leftEntity)
