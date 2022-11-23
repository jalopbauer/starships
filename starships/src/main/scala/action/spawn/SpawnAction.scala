package action.spawn

import action.Action
import entity.Entity
import gameData.GameData
import spawner.Spawner

case class SpawnAction(spawner: Spawner) extends Action:
  def act(gameData: GameData): GameData =
    gameData.add(spawner.spawn.get)