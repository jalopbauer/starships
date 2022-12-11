package action.spawn

import action.Action
import gameState.PlayingGameState

class UpdateSpawnTime extends SpawnAction:
  def act(gameData: PlayingGameState): PlayingGameState =
    gameData.copy(previousSpawnTime = gameData.currentTime)