package actionSource

import action.Action
import gameData.PlayingGameData

trait ActionSource:
  def createActions(gameData:PlayingGameData): List[Action]
