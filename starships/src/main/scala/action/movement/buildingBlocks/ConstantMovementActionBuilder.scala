package action.movement.buildingBlocks

import action.movement.{MovementAction, MovementActionBuilder, MovementActionBuilderInput}

case class ConstantMovementActionBuilder() extends MovementActionBuilder :
  def build(actionBuilderInput: MovementActionBuilderInput): ConstantMovementAction =
    ConstantMovementAction(actionBuilderInput.entity)
