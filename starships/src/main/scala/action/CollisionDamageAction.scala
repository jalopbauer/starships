package action

import entity.value.Collision
import gameState.PlayingGameState

case class CollisionDamageAction(collision: Collision) extends Action:
  def act(gameData: PlayingGameState): PlayingGameState =
    TwoEntitiesDamageEachOtherAction(collision.leftEntity, collision.rightEntity).act(gameData)
