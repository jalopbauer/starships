package actionSource

import action.Action
import gameState.PlayingGameState

trait ActionSource:
  def createActions(gameData:PlayingGameState): List[Action]
