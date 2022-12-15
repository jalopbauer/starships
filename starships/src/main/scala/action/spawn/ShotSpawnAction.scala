package action.spawn

import action.spawn.SpawnAction
import entity.Entity
import entity.value.motion.Coordinate
import entity.value.{EntityType, KeyPress}
import gameState.PlayingGameState

case class ShotSpawnAction() extends SpawnAction:
  def act(gameData: PlayingGameState): PlayingGameState =
    gameData.ships.foldLeft(gameData)((acc, ship) =>{
      val nextSeed = gameData.idSeed.next
      if (gameData.keyPresses.contains(KeyPress("r")) && ship.id == 1) {
        val motion = ship.motion
        val speed = motion.speed
        val coordinate = speed.speed
        val newSpeed = speed.copy(coordinate + Coordinate(coordinate.x + coordinate.x/coordinate.x, coordinate.y + coordinate.y/coordinate.y), 1, 1)
        val newMotion = motion.copy(speed = newSpeed)
        val entity = ship.copy(id = nextSeed._1, entityType = EntityType.SHOT, health = 1, damage = 1, motion = newMotion)
        acc.add(entity).copy(idSeed = nextSeed._2)
      }
      else acc
    })