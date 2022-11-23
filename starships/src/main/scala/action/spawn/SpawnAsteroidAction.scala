package action.spawn

import action.Action
import entity.Entity
import entity.value.motion.Motion
import entity.value.EntityType
import gameData.GameData
import spawner.Spawner

case class SpawnAsteroidAction(motion: Motion, damage: Int, health: Int) extends Action:
  def act(gameData: GameData): GameData =
    val nextBooleanSeed = gameData.booleanSeed.next
    val canSpawn = nextBooleanSeed._1
    if (canSpawn)
      val nextIdSeed = gameData.idSeed.next
      gameData.add(Entity(nextIdSeed._1, EntityType.ASTEROID, motion, damage, health))
        .copy(booleanSeed = nextBooleanSeed._2, idSeed = nextIdSeed._2)
    else gameData