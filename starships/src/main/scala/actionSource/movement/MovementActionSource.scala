package actionSource.movement

import action.Action
import action.movement.buildingBlocks.ConstantMovementActionBuilder
import action.movement.{MovementAction, MovementActionBuilder, MovementActionBuilderInput}
import actionSource.ActionSource
import entity.value.{EntityType, KeyPress}
import gameState.PlayingGameState

case class MovementActionSource(movementActionMap: Map[EntityType, MovementActionBuilder]) extends ActionSource:
  def createActions(gameData: PlayingGameState): List[Action] =
    gameData.entities.map(entity =>
      movementActionMap(entity.entityType).build(MovementActionBuilderInput(entity))
    )
