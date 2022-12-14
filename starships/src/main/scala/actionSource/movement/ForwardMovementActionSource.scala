package actionSource.movement

import action.Action
import action.movement.ForwardMovementAction
import actionSource.ActionSource
import entity.value.EntityType
import gameState.PlayingGameState

case class ForwardMovementActionSource(forwardMovementActionSourceConfig: ForwardMovementActionSourceConfig) extends ActionSource:
  def createActions(gameData: PlayingGameState): List[Action] =
    gameData.entities.filter(entity => forwardMovementActionSourceConfig.entityTypes.contains(entity.entityType)).map(ForwardMovementAction(_))
