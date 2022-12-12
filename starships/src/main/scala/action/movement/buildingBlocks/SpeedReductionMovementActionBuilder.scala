package action.movement.buildingBlocks

import action.movement.{MovementActionBuilder, MovementActionBuilderInput}


class SpeedReductionMovementActionBuilder(deacceleration: Double) extends MovementActionBuilder:
  def build(actionBuilderInput: MovementActionBuilderInput): SpeedReductionMovementAction =
    SpeedReductionMovementAction(deacceleration, actionBuilderInput.entity)