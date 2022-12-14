package actionSource.movement

import actionSource.ActionSourceConfig
import entity.value.EntityType


case class RegularMoveActionSourceConfig() extends MoveActionSourceConfig :
  def entityTypes: Seq[EntityType] = Seq(EntityType.ASTEROID, EntityType.SHOT)
