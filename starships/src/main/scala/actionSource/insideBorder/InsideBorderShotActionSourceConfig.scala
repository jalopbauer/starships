package actionSource.insideBorder

import actionSource.ActionSourceConfig
import entity.value.EntityType

case class InsideBorderShotActionSourceConfig() extends InsideBorderActionSourceConfig:
  def entityType: EntityType = EntityType.SHOT
