package actionSource.movement

import action.Action
import action.movement.{MovementAction, MovementActionBuilder, MovementActionBuilderInput}
import actionSource.ActionSource
import entity.value.{EntityType, KeyPress}
import gameState.PlayingGameState

case class MovementActionSource(movementActionMap: Map[EntityType, List[MovementActionBuilder]]
                                , movementActionMapWithKeyStroke: Map[(Int, KeyPress), List[MovementActionBuilder]]) extends ActionSource:
//  Claramente esto muy feo y hay que cambiar algo
  def createActions(gameData: PlayingGameState): List[Action] =
    val entities = gameData.entities
    entities.flatMap(entity => {
      val keyStrokeActionList = gameData.keyPresses.flatMap(keystroke => {
        val mapKey = (entity.id, keystroke)
        movementActionMapWithKeyStroke.getOrElse(mapKey, List())
      })
      if (keyStrokeActionList.nonEmpty) println(keyStrokeActionList)
      val actionList = movementActionMap(entity.entityType)
      actionList.map(_.build(MovementActionBuilderInput(entity)))
        ++ keyStrokeActionList.map(_.build(MovementActionBuilderInput(entity)))
    })
