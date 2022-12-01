package actionSource.spawn

import action.Action
import action.spawn.SpawnAction
import actionSource.ActionSource
import gameData.PlayingGameData

case class SpawnActionSource(spawnActions: List[SpawnAction]) extends ActionSource:
  def createActions(gameData: PlayingGameData): List[Action] =
    spawnActions