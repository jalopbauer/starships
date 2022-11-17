package actionSource.movement

import action.Action
import action.movement.{MovementAction, MovementActionBuilder, MovementActionBuilderInput}
import actionSource.ActionSource
import gameData.value.{EntityType, KeyStroke}
import gameData.GameData

case class MovementActionSource(movementActionMap: Map[EntityType, List[MovementActionBuilder]]
                                , movementActionMapWithKeyStroke: Map[(Int, KeyStroke), List[MovementActionBuilder]]) extends ActionSource:
//  Claramente esto muy feo y hay que cambiar algo
  def createActions(gameData: GameData): List[Action] =
    val entities = gameData.entities
    entities.flatMap(entity => {
      val keyStrokeActionList = gameData.keyStrokes.flatMap(keystroke => {
        val mapKey = (entity.id, keystroke)
        movementActionMapWithKeyStroke.getOrElse(mapKey, List())
      })
      val actionList = movementActionMap(entity.entityType)
      actionList.map(_.build(MovementActionBuilderInput(entity)))
        ++ keyStrokeActionList.map(_.build(MovementActionBuilderInput(entity)))
    })
