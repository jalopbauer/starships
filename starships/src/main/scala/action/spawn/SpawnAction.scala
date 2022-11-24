package action.spawn

import action.Action
import entity.Entity
import gameData.GameData
trait SpawnAction extends Action:
  def act(gameData: GameData): GameData