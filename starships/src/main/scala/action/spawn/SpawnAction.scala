package action.spawn

import action.Action
import entity.Entity
import gameData.GameData
import spawner.Spawner

case class SpawnAction(spawner: Spawner) extends Action:
  def act(gameData: GameData): GameData =
    val nextSeed = gameData.seed.next
    val maybeEntity = spawner.spawn(nextSeed._1)
    if (maybeEntity.isDefined) gameData.add(maybeEntity.get).copy(seed = nextSeed._2)
    else gameData