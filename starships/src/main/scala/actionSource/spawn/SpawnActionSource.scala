package actionSource.spawn

import action.Action
import action.spawn.SpawnAction
import actionSource.ActionSource
import gameData.GameData

case class SpawnActionSource() extends ActionSource:
  def createActions(gameData: GameData): List[Action] =
    gameData.spawners.filter(_.spawn.isDefined).map(SpawnAction(_))