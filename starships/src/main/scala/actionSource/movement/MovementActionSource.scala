package actionSource.movement

import action.Action
import action.movement.{MovementAction, MovementActionBuilder, MovementActionBuilderInput}
import actionSource.ActionSource
import gameData.{EntityType, GameData}

case class MovementActionSource(movementActionMap: Map[EntityType, List[MovementActionBuilder]]) extends ActionSource:
  def createActions(gameData: GameData): List[Action] =
    val entities = gameData.entities
    entities.flatMap(entity => {
      val actionList = movementActionMap(entity.entityType)
      actionList.map(_.build(MovementActionBuilderInput(entity)))
    })
