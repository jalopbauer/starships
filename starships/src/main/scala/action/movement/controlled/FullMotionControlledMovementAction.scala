package action.movement.controlled

import action.KeyPressIsActiveAction
import action.movement.{BackwardMovementAction, ForwardMovementAction, MovementAction, RotateLeftAction}
import entity.Entity
import entity.value.{ControlledMovementKeyPresses, KeyPress}
import gameState.PlayingGameState

case class FullMotionControlledMovementAction(controlledMovementKeyPresses: ControlledMovementKeyPresses) extends MovementAction :
  def act(gameData: PlayingGameState): PlayingGameState =
    val entity = controlledMovementKeyPresses.entity
    val entityId = entity.id
    val forwardMovementActionGameData = ControlledForwardMovementAction(entity, controlledMovementKeyPresses.forwardKeyPress).act(gameData)
    val forwardEntity = forwardMovementActionGameData.entity(entityId).get
    val backwardMovementActionGameData = ControlledBackwardMovementAction(forwardEntity, controlledMovementKeyPresses.backwardsKeyPress).act(forwardMovementActionGameData)
    val backwardEntity = backwardMovementActionGameData.entity(entityId).get
    val rotateLeftActionGameData = ControlledRotateLeftAction(backwardEntity, controlledMovementKeyPresses.rotateRightKeyPress).act(backwardMovementActionGameData)
    val rotateLeftEntity = rotateLeftActionGameData.entity(entityId).get
    ControlledRotateRightAction(rotateLeftEntity, controlledMovementKeyPresses.rotateLeftKeyPress).act(rotateLeftActionGameData)
