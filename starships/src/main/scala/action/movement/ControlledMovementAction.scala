package action.movement

import action.KeyPressIsActiveAction
import entity.Entity
import entity.value.KeyPress
import gameState.PlayingGameState

case class ControlledMovementAction(  entity: Entity
                                    , forwardKeyPress: KeyPress
                                    , backwardsKeyPress: KeyPress
                                    , rotateLeftKeyPress: KeyPress
                                    , rotateRightKeyPress: KeyPress
                                   ) extends MovementAction:
  def act(gameData: PlayingGameState): PlayingGameState =
    val forwardMovementActionGameData = KeyPressIsActiveAction(forwardKeyPress, ForwardMovementAction(entity)).act(gameData)
    val backwardMovementActionGameData = KeyPressIsActiveAction(backwardsKeyPress, BackwardMovementAction(entity)).act(forwardMovementActionGameData)
    val rotateLeftActionGameData = KeyPressIsActiveAction(rotateLeftKeyPress, RotateLeftAction(entity)).act(backwardMovementActionGameData)
    KeyPressIsActiveAction(rotateLeftKeyPress, RotateLeftAction(entity)).act(rotateLeftActionGameData)
