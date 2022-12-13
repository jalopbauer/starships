package action.movement.controlled

import action.KeyPressIsActiveAction
import action.movement.{MovementAction, RotateRightAction}
import entity.Entity
import entity.value.KeyPress
import gameState.PlayingGameState

case class ControlledRotateRightAction(entity: Entity
                                       , rotateRightKeyPress: KeyPress
                                   ) extends MovementAction :
  def act(gameData: PlayingGameState): PlayingGameState =
    KeyPressIsActiveAction(rotateRightKeyPress, RotateRightAction(entity)).act(gameData)
