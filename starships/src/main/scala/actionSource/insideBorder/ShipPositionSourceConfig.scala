package actionSource.insideBorder

import entity.value.EntityType

case class ShipPositionSourceConfig() extends PositionDependantActionSourceConfig :
  def ids: List[Int] = List(1, 2)

  def border: Int = 800

  def entityType: EntityType = EntityType.SHIP
