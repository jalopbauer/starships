package factory.actionSourceFactory

import action.movement.ShipForwardMovementAction
import action.movement.buildingBlocks.ConstantMovementActionBuilder
import actionSource.ActionSource
import actionSource.movement.MovementActionSource
import entity.value.{EntityType, KeyPress}

case class MovementActionSourceFactory() extends ActionSourceFactory:
  def create(): ActionSource =
    val constantMovementActionBuilder = ConstantMovementActionBuilder()
    MovementActionSource(
      Map(
        EntityType.ASTEROID -> constantMovementActionBuilder
        , EntityType.SHOT -> constantMovementActionBuilder
        , EntityType.SHIP -> constantMovementActionBuilder
      )
    )

