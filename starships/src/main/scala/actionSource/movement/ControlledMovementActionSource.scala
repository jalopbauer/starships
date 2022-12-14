package actionSource.movement

import action.Action
import action.movement.controlled.FullMotionControlledMovementAction
import actionSource.ActionSource
import entity.EntityIdControlledMovementKeyPresses
import entity.value.ControlledMovementKeyPresses
import gameState.PlayingGameState

case class ControlledMovementActionSource(controlledMovementActionSourceConfig: ControlledMovementActionSourceConfig) extends ActionSource:
  def createActions(gameData: PlayingGameState): List[Action] =
    controlledMovementActionSourceConfig.controlledMovementKeyPressesList.flatten(movement =>
      val maybeEntity = gameData.entity(movement.id)
      if (maybeEntity.isDefined) Some(FullMotionControlledMovementAction(ControlledMovementKeyPresses(maybeEntity.get, movement)))
      else None
    )
