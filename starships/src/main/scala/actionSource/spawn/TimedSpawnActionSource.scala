package actionSource.spawn

import action.Action
import action.spawn.SpawnAction
import action.spawn.UpdateSpawnTime
import actionSource.ActionSource
import gameState.PlayingGameState


case class TimedSpawnActionSource(time: Double, spawnActions: List[SpawnAction]) extends ActionSource:
  def createActions(gameData: PlayingGameState): List[Action] =
    if (gameData.currentTime - gameData.previousSpawnTime >= time) UpdateSpawnTime() :: spawnActions
    else List()