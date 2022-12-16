package action.spawn

import entity.Entity
import entity.value.EntityType
import entity.value.motion.Coordinate
import gameState.PlayingGameState

case class EntityShootsMovementAction(id: Int) extends SpawnAction:
  def act(gameData: PlayingGameState): PlayingGameState =
    val nextSeed = gameData.idSeed.next
    val maybeEntity = gameData.entity(id)
    if (maybeEntity.isDefined)
      val entity = maybeEntity.get
      val motion = entity.motion
      val speed = motion.speed
      val rotation = motion.rotation
      val coordinate = motion.position
      val speedCoordinate = speed.speed
      val x = if (coordinate.x == 0) 1 else coordinate.x
      val y = if (coordinate.y == 0) 1 else coordinate.y
      val newSpeed = speed.copy(Coordinate((x / x.abs) * 10, (y / y.abs) * 10), 1, 1)
      val newRotation = rotation.copy(angleInDegrees = rotation.angleInDegrees - 90)
      val newMotion = motion.copy(speed = newSpeed, rotation = newRotation)
      val shot = entity.copy(id = nextSeed._1, entityType = EntityType.SHOT, health = 1, damage = 1, motion = newMotion)
      gameData.add(shot).copy(idSeed = nextSeed._2)
    else gameData