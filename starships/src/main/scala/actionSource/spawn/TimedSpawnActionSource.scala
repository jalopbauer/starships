package actionSource.spawn

import action.Action
import action.spawn.*
import actionSource.ActionSource
import gameState.PlayingGameState

case class TimedSpawnActionSource(time: Double, spawnActions: List[SpawnAction]) extends ActionSource:
  def createActions(gameData: PlayingGameState): List[Action] =
    if (gameData.currentTime - gameData.previousSpawnTime < time) List()
    else UpdateSpawnTime() :: spawnActions