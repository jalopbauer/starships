package actionSource.movement

import action.movement.MovementAction
import actionSource.ActionSource
import gameState.PlayingGameState


trait MovementActionSource extends ActionSource:
  def createActions(gameData: PlayingGameState): List[MovementAction]

