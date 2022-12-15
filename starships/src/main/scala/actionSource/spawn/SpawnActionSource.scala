package actionSource.spawn

import action.Action
import action.spawn.ShotSpawnAction
import actionSource.ActionSource
import gameState.PlayingGameState

case class SpawnActionSource(spawnActionSourceConfig: SpawnActionSourceConfig) extends ActionSource :
  def createActions(gameData: PlayingGameState): List[Action] =
    spawnActionSourceConfig.entityShootKeys.map(entityShootKey => ShotSpawnAction(entityShootKey._1, entityShootKey._2))
