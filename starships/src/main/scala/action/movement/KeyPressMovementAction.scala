package action.movement

import entity.Entity
import entity.value.KeyPress
import gameState.PlayingGameState

case class KeyPressMovementAction(  entity: Entity
                                  , keyPress: KeyPress
                                  , movementAction: MovementAction
                                 ) extends MovementAction(entity):

  def act(gameData: PlayingGameState): PlayingGameState =
    if (!gameData.contains(keyPress)) gameData
    else movementAction.act(gameData)