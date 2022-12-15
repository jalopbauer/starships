package actionSource.insideBorder

import actionSource.ActionSourceConfig
import entity.value.EntityType

case class InsideBorderShipActionSourceConfig(border: Int) extends InsideBorderActionSourceConfig:
  def entityType: EntityType = EntityType.SHIP
