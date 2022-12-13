package action

import action.movement.MovementAction
import entity.value.KeyPress
import gameState.PlayingGameState

case class KeyPressMovementAction(keyPress: KeyPress
                                  , movementAction: MovementAction
                                 ) extends Action :

  def act(gameData: PlayingGameState): PlayingGameState =
    if (!gameData.contains(keyPress)) gameData
    else movementAction.act(gameData)
