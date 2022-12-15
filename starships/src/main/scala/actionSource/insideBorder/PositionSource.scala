package actionSource.insideBorder

import action.{Action, SetEntityInsideBorderAction}
import actionSource.ActionSource
import gameState.PlayingGameState

case class PositionSource(positionSourceConfig: ShipPositionSourceConfig) extends ActionSource :
  def createActions(gameData: PlayingGameState): List[Action] =
    positionSourceConfig.ids.map(SetEntityInsideBorderAction(_, positionSourceConfig.border))
