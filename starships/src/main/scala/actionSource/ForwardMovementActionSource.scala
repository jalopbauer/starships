package actionSource

import action.movement.ForwardMovementAction
import action.Action
import entity.value.EntityType
import gameState.PlayingGameState

case class ForwardMovementActionSource(entityTypes: Seq[EntityType]):
  def createActions(gameData: PlayingGameState): List[Action] =
    gameData.entities.filter(entity => entityTypes.contains(entity.entityType)).map(ForwardMovementAction(_))
