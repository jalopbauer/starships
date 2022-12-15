package action.spawn

import action.spawn.SpawnAction
import entity.Entity
import entity.value.motion.Motion
import entity.value.{EntityType, Shape}
import gameState.PlayingGameState

case class SpawnAsteroidAction(motion: Motion, damage: Int, health: Int, shape: Shape) extends SpawnAction:
  def act(gameData: PlayingGameState): PlayingGameState =
    val nextBooleanSeed = gameData.booleanSeed.next
    val canSpawn = nextBooleanSeed._1
    if (canSpawn)
      val nextIdSeed = gameData.idSeed.next
      gameData.add(Entity(nextIdSeed._1, EntityType.ASTEROID, motion, damage, health, shape))
        .copy(booleanSeed = nextBooleanSeed._2, idSeed = nextIdSeed._2)
    else gameData.copy(booleanSeed = nextBooleanSeed._2)