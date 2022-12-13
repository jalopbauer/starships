package action

import entity.value.KeyPress
import gameState.PlayingGameState

trait ExistsEntityAction(id: Int
                              , action: Action
                                 ) extends ConditionalAction :

  def isConditionMet(gameData: PlayingGameState): Boolean = gameData.entity(id).isDefined