package action.movement.controlled

import action.KeyPressIsActiveAction
import action.movement.{BackwardMovementAction, MovementAction}
import entity.Entity
import entity.value.KeyPress
import gameState.PlayingGameState

case class ControlledBackwardMovementAction(entity: Entity
                                            , backwardKeyPress: KeyPress
                                           ) extends MovementAction :
  def act(gameData: PlayingGameState): PlayingGameState =
    KeyPressIsActiveAction(backwardKeyPress, BackwardMovementAction(entity)).act(gameData)
