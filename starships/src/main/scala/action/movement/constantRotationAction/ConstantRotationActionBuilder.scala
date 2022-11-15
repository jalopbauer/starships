package action.movement.constantRotationAction

import action.movement.{MovementAction, MovementActionBuilder, MovementActionBuilderInput}
import action.movement.constantMovementAction.ConstantMovementAction

class ConstantRotationActionBuilder(rotationValueInDegrees: Int) extends MovementActionBuilder:
  def build(actionBuilderInput: MovementActionBuilderInput): MovementAction =
    ConstantRotationAction(rotationValueInDegrees)