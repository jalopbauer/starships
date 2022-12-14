package action.movement.controlled

import action.KeyPressIsActiveAction
import action.movement.{MovementAction, RotateLeftAction}
import entity.Entity
import entity.value.KeyPress
import gameState.PlayingGameState

case class ControlledRotateLeftAction(id: Int
                                      , rotateLeftKeyPress: KeyPress
                                   ) extends MovementAction :
  def act(gameData: PlayingGameState): PlayingGameState =
    KeyPressIsActiveAction(rotateLeftKeyPress, RotateLeftAction(id)).act(gameData)
