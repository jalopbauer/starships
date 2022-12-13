package actionSource

import action.Action
import action.movement.controlled.FullMotionControlledMovementAction
import entity.value.ControlledMovementKeyPresses
import gameState.PlayingGameState

case class ControlledMovementActionSource(controlledMovementKeyPressesList: List[ControlledMovementKeyPresses]):
  def createActions(gameData: PlayingGameState): List[Action] =
    controlledMovementKeyPressesList.map(FullMotionControlledMovementAction(_))
