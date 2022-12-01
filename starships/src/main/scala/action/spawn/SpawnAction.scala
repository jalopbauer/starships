package action.spawn

import action.Action
import entity.Entity
import gameData.PlayingGameData
trait SpawnAction extends Action:
  def act(gameData: PlayingGameData): PlayingGameData