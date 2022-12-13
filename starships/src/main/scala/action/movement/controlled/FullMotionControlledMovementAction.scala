package action.movement.controlled

import action.KeyPressIsActiveAction
import action.movement.{BackwardMovementAction, ForwardMovementAction, MovementAction, RotateLeftAction}
import entity.Entity
import entity.value.{ControlledMovementKeyPresses, KeyPress}
import gameState.PlayingGameState

case class FullMotionControlledMovementAction(controlledMovementKeyPresses: ControlledMovementKeyPresses) extends MovementAction :
  def act(gameData: PlayingGameState): PlayingGameState =
    val entity = controlledMovementKeyPresses.entity
    val forwardMovementActionGameData = ControlledBackwardMovementAction(entity, controlledMovementKeyPresses.forwardKeyPress).act(gameData)
    val backwardMovementActionGameData = ControlledForwardMovementAction(entity, controlledMovementKeyPresses.backwardsKeyPress).act(forwardMovementActionGameData)
    val rotateLeftActionGameData = ControlledRotateLeftAction(entity, controlledMovementKeyPresses.rotateLeftKeyPress).act(backwardMovementActionGameData)
    ControlledRotateRightAction(entity, controlledMovementKeyPresses.rotateRightKeyPress).act(rotateLeftActionGameData)
