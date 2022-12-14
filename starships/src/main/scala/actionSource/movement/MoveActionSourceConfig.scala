package actionSource.movement

import actionSource.ActionSourceConfig
import entity.value.EntityType


trait MoveActionSourceConfig extends ActionSourceConfig[MoveActionSource] :
  def entityTypes: Seq[EntityType]
