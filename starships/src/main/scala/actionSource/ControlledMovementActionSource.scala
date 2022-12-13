package actionSource

import action.Action
import entity.value.ControlledMovementKeyPresses
import gameState.PlayingGameState

case class ControlledMovementActionSource(controlledMovementKeyPressesList: List[ControlledMovementKeyPresses]):
  def createActions(gameData: PlayingGameState): List[Action] =
    List()
