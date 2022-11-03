package actionSource

import action.Action
import gameData.GameData

trait ActionSource:
  def createActions(gameData:GameData): List[Action]
