package actionSource.insideBorder

import actionSource.ActionSourceConfig
import entity.value.EntityType

case class InsideBorderAsteroidActionSourceConfig(border: Int) extends InsideBorderActionSourceConfig:
  def entityType: EntityType = EntityType.ASTEROID
