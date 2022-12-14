package actionSource.spawn

import action.Action
import action.spawn.SpawnAction
import action.spawn.UpdateSpawnTime
import actionSource.ActionSource
import gameState.PlayingGameState


case class TimedSpawnActionSource(timedSpawnActionSourceConfig: TimedSpawnActionSourceConfig) extends ActionSource:
  def createActions(gameData: PlayingGameState): List[Action] =
    if (gameData.currentTime - gameData.previousSpawnTime >= timedSpawnActionSourceConfig.time) UpdateSpawnTime() :: timedSpawnActionSourceConfig.spawnActions
    else List()