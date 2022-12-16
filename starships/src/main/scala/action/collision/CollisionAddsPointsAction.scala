package action.collision

import action.{Action, TwoEntitiesDamageEachOtherAction}
import entity.value.{Collision, EntityType}
import gameState.PlayingGameState

case class CollisionAddsPointsAction(collision: Collision) extends CollisionAction:
  def act(gameData: PlayingGameState): PlayingGameState =
    val entity = if (collision.leftEntity.entityType == EntityType.ASTEROID) collision.leftEntity else collision.rightEntity
    val points = if(entity.health == 0) gameData.points + 10 * entity.damage else gameData.points + entity.damage
    gameData.copy(points = points)