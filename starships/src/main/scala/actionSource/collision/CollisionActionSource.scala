package actionSource.collision

import action.Action
import action.collision.{CollisionActionBuilder, CollisionActionBuilderInput}
import actionSource.ActionSource
import gameData.{EntityType, GameData}

case class CollisionActionSource(collisionsActionMap: Map[(EntityType, EntityType), (List[CollisionActionBuilder], List[CollisionActionBuilder])]) extends ActionSource:
  def createActions(gameData: GameData): List[Action] =
    val collisions = gameData.collisions
    collisions.flatMap(collision => {
      val entityIdTuple = collision.getEntityIdTuple
      val actionListTuple = collisionsActionMap(collision.getEntityTypeTuple)
      val firstEntityActions = actionListTuple._1.map(_.build(CollisionActionBuilderInput(entityIdTuple._1)))
      val secondEntityActions = actionListTuple._2.map(_.build(CollisionActionBuilderInput(entityIdTuple._2)))
      firstEntityActions ++ secondEntityActions
    })
