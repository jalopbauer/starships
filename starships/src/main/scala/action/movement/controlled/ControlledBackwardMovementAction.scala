package action.movement.controlled

import action.KeyPressIsActiveAction
import action.movement.{BackwardMovementAction, MovementAction}
import entity.Entity
import entity.value.KeyPress
import gameState.PlayingGameState

case class ControlledBackwardMovementAction(id: Int
                                            , backwardKeyPress: KeyPress
                                           ) extends MovementAction :
  def act(gameData: PlayingGameState): PlayingGameState =
    KeyPressIsActiveAction(backwardKeyPress, BackwardMovementAction(id)).act(gameData)
