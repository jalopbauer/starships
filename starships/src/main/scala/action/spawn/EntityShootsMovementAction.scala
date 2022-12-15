package action.spawn

import entity.Entity
import entity.value.EntityType
import entity.value.motion.Coordinate
import gameState.PlayingGameState

case class EntityShootsMovementAction(id: Int) extends SpawnAction:
  def act(gameData: PlayingGameState): PlayingGameState =
    val nextSeed = gameData.idSeed.next
    val entity = gameData.entity(id).get
    val motion = entity.motion
    val speed = motion.speed
    val coordinate = speed.speed
    val newSpeed = speed.copy(coordinate + Coordinate(coordinate.x + coordinate.x / coordinate.x, coordinate.y + coordinate.y / coordinate.y), 1, 1)
    val newMotion = motion.copy(speed = newSpeed)
    val shot = entity.copy(id = nextSeed._1, entityType = EntityType.SHOT, health = 1, damage = 1, motion = newMotion)
    gameData.add(shot).copy(idSeed = nextSeed._2)
