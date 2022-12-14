package actionSource.movement

import actionSource.ActionSourceConfig
import entity.value.EntityType


case class RegularForwardMovementActionSourceConfig() extends ForwardMovementActionSourceConfig :
  def entityTypes: Seq[EntityType] = Seq(EntityType.ASTEROID, EntityType.SHOT)
