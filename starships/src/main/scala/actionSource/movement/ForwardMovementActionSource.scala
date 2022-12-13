package actionSource.movement

import action.movement.{MoveForwardAction, MovementAction}
import entity.value.EntityType
import gameState.PlayingGameState


case class ForwardMovementActionSource(entityTypes: Seq[EntityType]) extends MovementActionSource:
  def createActions(gameData: PlayingGameState): List[MovementAction] =
    gameData.entities.filter(entity => entityTypes.contains(entity.entityType)).map(MoveForwardAction(_))

