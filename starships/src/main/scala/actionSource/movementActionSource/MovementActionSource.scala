package actionSource.movementActionSource

import action.Action
import action.movementAction.MovementAction
import actionSource.ActionSource
import gameData.{EntityType, GameData}

case class MovementActionSource(movementActionMap: Map[EntityType, List[MovementAction]]) extends ActionSource:
  def createActions(gameData: GameData): List[Action] =
    val entities = gameData.entities
    entities.flatMap(entity => {
      val actionList = movementActionMap(entity.entityType)
      actionList.map(_.setKeyStrokes(gameData.keyStrokes).setId(entity.id))
    })
