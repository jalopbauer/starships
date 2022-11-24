package actionSource.spawn

import action.Action
import action.spawn.SpawnAction
import actionSource.ActionSource
import gameData.GameData

case class SpawnActionSource(spawnActions: List[SpawnAction]) extends ActionSource:
  def createActions(gameData: GameData): List[Action] =
    spawnActions