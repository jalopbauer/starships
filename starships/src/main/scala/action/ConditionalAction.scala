package action

import entity.Entity
import gameState.PlayingGameState

trait ConditionalAction(action: Action) extends Action:
  def act(gameData: PlayingGameState): PlayingGameState =
    if (isConditionMet(gameData)) action.act(gameData)
    else gameData
    
  def isConditionMet(gameData: PlayingGameState): Boolean