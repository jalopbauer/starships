package actionSource.spawn

import action.Action
import action.spawn.SpawnAction
import actionSource.ActionSource
import gameState.PlayingGameState

case class SpawnActionSource(spawnActionSourceConfig: SpawnActionSourceConfig) extends ActionSource :
  def createActions(gameData: PlayingGameState): List[Action] =
    spawnActionSourceConfig.spawnActions
