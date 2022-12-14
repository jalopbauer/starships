package factory.actionsource

import actionSource.movement.ControlledMovementActionSource
import factory.IdListSeed
import factory.actionSourceConfig.ControlledMovementActionSourceConfigFactory

case class ControlledMovementActionSourceFactory():
  val controlledMovementActionSourceConfigFactory: ControlledMovementActionSourceConfigFactory = ControlledMovementActionSourceConfigFactory()
  def create(idListSeed: IdListSeed): ControlledMovementActionSource =
    ControlledMovementActionSource(controlledMovementActionSourceConfigFactory.create(idListSeed))

