package actionSource.movement

import action.Action
import action.movement.MoveAction
import actionSource.ActionSource
import entity.value.EntityType
import gameState.PlayingGameState

case class MoveActionSource(moveActionSourceConfig: MoveActionSourceConfig) extends ActionSource:
  def createActions(gameData: PlayingGameState): List[Action] =
    gameData.entities.filter(entity => moveActionSourceConfig.entityTypes.contains(entity.entityType)).map(MoveAction(_))
