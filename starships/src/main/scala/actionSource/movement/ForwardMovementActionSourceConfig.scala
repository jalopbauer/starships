package actionSource.movement

import actionSource.ActionSourceConfig
import entity.value.EntityType


trait ForwardMovementActionSourceConfig extends ActionSourceConfig[ForwardMovementActionSource] :
  def entityTypes: Seq[EntityType]
