package actionSource.insideBorder.setEntity

import action.{Action, SetEntityInsideBorderAction}
import actionSource.insideBorder.{InsideBorderActionSource, InsideBorderActionSourceConfig}
import gameState.PlayingGameState

case class InsideBorderActionSourceSetEntity(insideBorderShipActionSourceConfig: InsideBorderActionSourceConfig) extends InsideBorderActionSource(insideBorderShipActionSourceConfig) :
  def createActions(gameData: PlayingGameState): List[Action] =
    gameData.entities
      .filter(_.entityType == insideBorderShipActionSourceConfig.entityType)
      .map(entity => SetEntityInsideBorderAction(entity.id, insideBorderShipActionSourceConfig.border))
