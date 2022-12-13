package action

import entity.value.KeyPress
import gameState.PlayingGameState

case class KeyPressIsActiveAction(keyPress: KeyPress
                                  , action: Action
                                 ) extends ConditionalAction(action) :

  override def isConditionMet(gameData: PlayingGameState): Boolean = gameData.contains(keyPress)