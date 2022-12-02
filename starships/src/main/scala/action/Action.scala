package action

import entity.Entity
import gameState.PlayingGameState

trait Action:
  def act(gameData: PlayingGameState): PlayingGameState