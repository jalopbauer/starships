package action.spawn

import action.Action
import entity.Entity
import gameState.PlayingGameState
trait SpawnAction extends Action:
  def act(gameData: PlayingGameState): PlayingGameState