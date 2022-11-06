package gameData

trait Collision():
  def getEntityTypeTuple:(EntityType, EntityType)
  def getEntityIdTuple:(Int, Int)
