package action.movement.controlled

import action.KeyPressIsActiveAction
import action.movement.{BackwardMovementAction, ForwardMovementAction, MovementAction, RotateLeftAction}
import entity.{Entity, EntityIdControlledMovementKeyPresses}
import entity.value.KeyPress
import gameState.PlayingGameState

case class FullMotionControlledMovementAction(controlledMovementKeyPresses: EntityIdControlledMovementKeyPresses) extends MovementAction :
  def act(gameData: PlayingGameState): PlayingGameState =
    val entityId = controlledMovementKeyPresses.id
    List(
      ControlledBackwardMovementAction(entityId, controlledMovementKeyPresses.forwardKeyPress)
      , ControlledForwardMovementAction(entityId, controlledMovementKeyPresses.backwardsKeyPress)
      , ControlledForwardMovementAction(entityId, controlledMovementKeyPresses.backwardsKeyPress)
      , ControlledRotateRightAction(entityId, controlledMovementKeyPresses.rotateRightKeyPress)
    ).foldLeft(gameData)((gameData, movementAction) => movementAction.act(gameData))
