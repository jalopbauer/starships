package actionSource

import action.{Action, SetEntityInsideBorderAction}
import action.spawn.SpawnAction
import actionSource.ActionSource
import gameState.PlayingGameState

case class PositionSource(positionSourceConfig: PositionSourceConfig) extends ActionSource :
  def createActions(gameData: PlayingGameState): List[Action] =
    positionSourceConfig.ids.map(SetEntityInsideBorderAction(_, positionSourceConfig.border))
