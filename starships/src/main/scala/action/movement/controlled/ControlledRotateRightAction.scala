package action.movement.controlled

import action.KeyPressIsActiveAction
import action.movement.{MovementAction, RotateRightAction}
import entity.Entity
import entity.value.KeyPress
import gameState.PlayingGameState

case class ControlledRotateRightAction(id: Int
                                       , rotateRightKeyPress: KeyPress
                                   ) extends MovementAction :
  def act(gameData: PlayingGameState): PlayingGameState =
    KeyPressIsActiveAction(rotateRightKeyPress, RotateRightAction(id)).act(gameData)
