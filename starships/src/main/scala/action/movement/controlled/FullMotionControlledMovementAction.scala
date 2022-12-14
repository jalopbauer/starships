package action.movement.controlled

import action.KeyPressIsActiveAction
import action.movement.{BackwardMovementAction, ForwardMovementAction, MovementAction, RotateLeftAction}
import entity.{Entity, EntityIdControlledMovementKeyPresses}
import entity.value.KeyPress
import gameState.PlayingGameState

case class FullMotionControlledMovementAction(controlledMovementKeyPresses: EntityIdControlledMovementKeyPresses) extends MovementAction :
  def act(gameData: PlayingGameState): PlayingGameState =
    val entityId = controlledMovementKeyPresses.id
    val forwardMovementActionGameData = ControlledBackwardMovementAction(entityId, controlledMovementKeyPresses.forwardKeyPress).act(gameData)
    val backwardMovementActionGameData = ControlledForwardMovementAction(entityId, controlledMovementKeyPresses.backwardsKeyPress).act(forwardMovementActionGameData)
    val rotateLeftActionGameData = ControlledRotateLeftAction(entityId, controlledMovementKeyPresses.rotateLeftKeyPress).act(backwardMovementActionGameData)
    ControlledRotateRightAction(entityId, controlledMovementKeyPresses.rotateRightKeyPress).act(rotateLeftActionGameData)
