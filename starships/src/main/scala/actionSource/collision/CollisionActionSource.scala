package actionSource.collision

import action.Action
import actionSource.ActionSource
import gameState.PlayingGameState

case class CollisionActionSource(collisionActionSourceConfig: CollisionActionSourceConfig) extends ActionSource:
  def createActions(gameData: PlayingGameState): List[Action] =
    gameData.collisions.flatMap(collisionActionSourceConfig.collisionToMaybeCollisionAction)
