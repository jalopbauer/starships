package factory.actionsource

import actionSource.movement.{MoveActionSource, RegularMoveActionSourceConfig}

case class MoveActionSourceFactory():
  def create: MoveActionSource =
    MoveActionSource(RegularMoveActionSourceConfig())


