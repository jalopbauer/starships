package actionSource.collision

import action.collision.{CollisionAction, CollisionDamageAction}
import actionSource.ActionSourceConfig
import entity.value.{Collision, EntityType, EntityTypeCollision}

case class RegularCollisionActionSourceConfig() extends CollisionActionSourceConfig:
  def collisionToMaybeCollisionAction(collision: Collision): Option[CollisionAction] =
    if (List(EntityTypeCollision(EntityType.SHIP, EntityType.ASTEROID)
      , EntityTypeCollision(EntityType.ASTEROID, EntityType.SHOT)
    ).exists(EntityTypeCollision.compare(_, collision.entityTypeCollision))) Some(CollisionDamageAction(collision))
    else None
