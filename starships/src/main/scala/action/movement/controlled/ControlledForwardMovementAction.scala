package action.movement.controlled

import action.KeyPressIsActiveAction
import action.movement.{MovementAction, ForwardMovementAction}
import entity.Entity
import entity.value.KeyPress
import gameState.PlayingGameState

case class ControlledForwardMovementAction(id: Int
                                           , forwardKeyPress: KeyPress
                                           ) extends MovementAction :
  def act(gameData: PlayingGameState): PlayingGameState =
    KeyPressIsActiveAction(forwardKeyPress, ForwardMovementAction(id)).act(gameData)
