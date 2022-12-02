package action.movement

import action.movement.{ConstantMovementAction, MovementAction, MovementActionBuilder, MovementActionBuilderInput}

class ConstantRotationActionBuilder(rotationValueInDegrees: Int) extends MovementActionBuilder:
  def build(actionBuilderInput: MovementActionBuilderInput): MovementAction =
    ConstantRotationAction(rotationValueInDegrees, actionBuilderInput.entity)