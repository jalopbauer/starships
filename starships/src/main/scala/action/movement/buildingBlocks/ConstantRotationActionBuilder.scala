package action.movement.buildingBlocks

import action.movement.{MovementAction, MovementActionBuilder, MovementActionBuilderInput}

class ConstantRotationActionBuilder(rotationValueInDegrees: Double) extends MovementActionBuilder:
  def build(actionBuilderInput: MovementActionBuilderInput): MovementAction =
    ConstantRotationAction(rotationValueInDegrees, actionBuilderInput.entity)