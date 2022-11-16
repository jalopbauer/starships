package gameData

case class Collision(leftEntity: Entity, rightEntity: Entity):
  def getEntityTypeTuple:(EntityType, EntityType) =
    (leftEntity.entityType, rightEntity.entityType)
