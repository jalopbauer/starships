package actionSource.collision

import action.collision.CollisionAction
import actionSource.ActionSourceConfig
import entity.value.Collision

trait CollisionActionSourceConfig() extends ActionSourceConfig[CollisionActionSource]:
  def collisionToMaybeCollisionAction(collision: Collision): Option[CollisionAction]
