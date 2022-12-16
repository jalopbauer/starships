package actionSource.collision

import action.collision.{CollisionAction, CollisionAddsPointsAction}
import actionSource.ActionSourceConfig
import entity.value.{Collision, EntityType, EntityTypeCollision}

case class AddPointsCollisionActionSourceConfig() extends CollisionActionSourceConfig:
  def collisionToMaybeCollisionAction(collision: Collision): Option[CollisionAction] =
    if (List(EntityTypeCollision(EntityType.SHOT, EntityType.ASTEROID)
    ).exists(EntityTypeCollision.compare(_, collision.entityTypeCollision))) Some(CollisionAddsPointsAction(collision))
    else None
