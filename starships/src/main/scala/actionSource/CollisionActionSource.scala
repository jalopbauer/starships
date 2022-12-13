package actionSource

import action.Action
import action.collision.CollisionAction
import entity.value.Collision
import gameState.PlayingGameState

case class CollisionActionSource(p: Collision => Option[CollisionAction]) extends ActionSource :
  def createActions(gameData: PlayingGameState): List[Action] =
    gameData.collisions.flatMap(p(_))