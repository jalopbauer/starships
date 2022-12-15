package actionSource

import actionSource.ActionSourceConfig

case class PositionSourceConfig() extends ActionSourceConfig[PositionSource]:
  def ids: List[Int] = List(1, 2)
  def border: Int = 800