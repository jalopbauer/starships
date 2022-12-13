package action.collision

import action.{Action, TwoEntitiesDamageEachOtherAction}
import entity.value.Collision
import gameState.PlayingGameState

case class CollisionDamageAction(collision: Collision) extends CollisionAction:
  def act(gameData: PlayingGameState): PlayingGameState =
    TwoEntitiesDamageEachOtherAction(collision.leftEntity, collision.rightEntity).act(gameData)
