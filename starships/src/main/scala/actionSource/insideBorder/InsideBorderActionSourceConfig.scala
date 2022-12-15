package actionSource.insideBorder

import actionSource.ActionSourceConfig
import entity.value.EntityType

trait InsideBorderActionSourceConfig() extends ActionSourceConfig[InsideBorderActionSource] :
  def border: Int = 800
  def entityType: EntityType
