package action.movement.variableMovementAction

import action.movement.{MovementAction, MovementActionBuilder, MovementActionBuilderInput}
import action.movement.constantMovementAction.ConstantMovementAction

case class VariableMovementActionBuilder(gradient: Int) extends MovementActionBuilder:
  def build(actionBuilderInput: MovementActionBuilderInput): VariableMovementAction =
    VariableMovementAction(gradient)
