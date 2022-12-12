package action.movement.buildingBlocks

import action.movement.{MovementActionBuilder, MovementActionBuilderInput}

case class VariableMovementActionBuilder(gradient: Double) extends MovementActionBuilder :
  def build(actionBuilderInput: MovementActionBuilderInput): VariableMovementAction =
    VariableMovementAction(gradient, actionBuilderInput.entity)
