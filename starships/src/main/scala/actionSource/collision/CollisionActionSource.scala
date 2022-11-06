package actionSource.collision

import action.Action
import actionSource.ActionSource
import gameData.{EntityType, GameData}

case class CollisionActionSource(collisionsActionMap: Map[(EntityType, EntityType), (List[Action], List[Action])]) extends ActionSource:
  def createActions(gameData: GameData): List[Action] =
    val collisions = gameData.collisions
    collisions.flatMap(collision => {
      val entityIdTuple = collision.getEntityIdTuple
      val actionListTuple = collisionsActionMap(collision.getEntityTypeTuple)
      val firstEntityActions = actionListTuple._1.map(action => action.setId(entityIdTuple._1))
      val secondEntityActions = actionListTuple._2.map(action => action.setId(entityIdTuple._2))
      firstEntityActions ++ secondEntityActions
    })
