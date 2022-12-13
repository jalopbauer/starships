package action.movement.controlled

import action.KeyPressIsActiveAction
import action.movement.{BackwardMovementAction, ForwardMovementAction, MovementAction, RotateLeftAction}
import entity.Entity
import entity.value.KeyPress
import gameState.PlayingGameState

case class FullMotionControlledMovementAction(entity: Entity
                                              , forwardKeyPress: KeyPress
                                              , backwardsKeyPress: KeyPress
                                              , rotateLeftKeyPress: KeyPress
                                              , rotateRightKeyPress: KeyPress
                                   ) extends MovementAction :
  def act(gameData: PlayingGameState): PlayingGameState =
    val forwardMovementActionGameData = ControlledBackwardMovementAction(entity, forwardKeyPress).act(gameData)
    val backwardMovementActionGameData = ControlledForwardMovementAction(entity, backwardsKeyPress).act(forwardMovementActionGameData)
    val rotateLeftActionGameData = ControlledRotateLeftAction(entity, rotateLeftKeyPress).act(backwardMovementActionGameData)
    ControlledRotateRightAction(entity, rotateRightKeyPress).act(rotateLeftActionGameData)
