package actionSource

import action.Action
import action.spawn.SpawnAction
import gameState.PlayingGameState

case class SpawnActionSource(spawnActions: List[SpawnAction]) extends ActionSource :
  def createActions(gameData: PlayingGameState): List[Action] =
    spawnActions
