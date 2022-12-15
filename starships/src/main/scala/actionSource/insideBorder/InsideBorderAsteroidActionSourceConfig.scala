package actionSource.insideBorder

import actionSource.ActionSourceConfig
import entity.value.EntityType

case class InsideBorderAsteroidActionSourceConfig() extends InsideBorderActionSourceConfig:
  def entityType: EntityType = EntityType.ASTEROID
