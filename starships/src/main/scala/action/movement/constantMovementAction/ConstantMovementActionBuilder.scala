package action.movement.constantMovementAction

import action.movement.{MovementAction, MovementActionBuilder, MovementActionBuilderInput}

case class ConstantMovementActionBuilder() extends MovementActionBuilder:
  def build(actionBuilderInput: MovementActionBuilderInput): ConstantMovementAction =
    ConstantMovementAction()
