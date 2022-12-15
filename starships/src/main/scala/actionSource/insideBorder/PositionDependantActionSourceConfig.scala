package actionSource.insideBorder

import actionSource.ActionSourceConfig
import entity.value.EntityType

trait PositionDependantActionSourceConfig() extends ActionSourceConfig[PositionSource] :
  def ids: List[Int]

  def border: Int

  def entityType: EntityType
