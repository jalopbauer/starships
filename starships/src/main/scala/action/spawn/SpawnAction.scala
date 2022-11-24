package action.spawn

import action.Action
import entity.Entity
import gameData.GameData
import spawner.Spawner

trait SpawnAction extends Action:
  def act(gameData: GameData): GameData