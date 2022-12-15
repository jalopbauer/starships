package actionSource.insideBorder.removeEntity

import action.Action
import action.insideBorder.RemoveEntityOutsideBorderAction
import actionSource.insideBorder.{InsideBorderActionSource, InsideBorderActionSourceConfig}
import gameState.PlayingGameState

case class InsideBorderActionSourceRemoveEntity(insideBorderShipActionSourceConfig: InsideBorderActionSourceConfig) extends InsideBorderActionSource(insideBorderShipActionSourceConfig) :
  def createActions(gameData: PlayingGameState): List[Action] =
    gameData.entities
      .filter(_.entityType == insideBorderShipActionSourceConfig.entityType)
      .map(entity => RemoveEntityOutsideBorderAction(entity.id, insideBorderShipActionSourceConfig.border))
