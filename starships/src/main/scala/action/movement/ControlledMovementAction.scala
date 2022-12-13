package action.movement

import action.{EntityKeyPressAction, KeyPressIsActiveAction, SingleEntityAction}
import entity.Entity
import entity.value.KeyPress
import gameState.PlayingGameState

case class ControlledMovementAction(  entity: Entity
                                    , forwardKeyPress: KeyPress
                                    , backwardsKeyPress: KeyPress
                                    , rotateLeftKeyPress: KeyPress
                                    , rotateRightKeyPress: KeyPress
                                   ) extends MovementAction with SingleEntityAction(entity):
  def act(gameData: PlayingGameState): PlayingGameState =
    KeyPressIsActiveAction(forwardKeyPress, ForwardMovementAction(entity))
    KeyPressIsActiveAction(backwardsKeyPress, BackwardMovementAction(entity))
    KeyPressIsActiveAction(rotateLeftKeyPress, RotateLeftAction(entity))
    KeyPressIsActiveAction(rotateLeftKeyPress, RotateLeftAction(entity))
    gameData
