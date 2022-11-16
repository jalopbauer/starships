package actionSource.collision

import action.Action
import action.collision.{CollisionActionBuilder, CollisionActionBuilderInput}
import actionSource.ActionSource
import gameData.{EntityType, GameData}

case class CollisionActionSource(collisionsActionMap: Map[(EntityType, EntityType), (List[CollisionActionBuilder], List[CollisionActionBuilder])]) extends ActionSource:
  def createActions(gameData: GameData): List[Action] =
    val collisions = gameData.collisions
    collisions.flatMap(collision => {
      val actionListTuple = collisionsActionMap.get(collision.getEntityTypeTuple) match {
        case None => collisionsActionMap.get(collision.inverse.getEntityTypeTuple) match
          case None => (List():List[CollisionActionBuilder], List(): List[CollisionActionBuilder])
          case Some(value) => value
        case Some(value) => value
      }

      val collisionBuilderInput = CollisionActionBuilderInput(collision.rightEntity, collision.leftEntity)
      val firstEntityActions = actionListTuple._1.map(_.build(collisionBuilderInput))
      val secondEntityActions = actionListTuple._2.map(_.build(collisionBuilderInput.inverse))
      firstEntityActions ++ secondEntityActions
    })
