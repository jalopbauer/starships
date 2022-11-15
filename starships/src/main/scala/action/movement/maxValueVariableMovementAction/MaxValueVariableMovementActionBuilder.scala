package action.movement.maxValueVariableMovementAction

import action.movement.constantMovementAction.ConstantMovementActionBuilder
import action.movement.variableMovementAction.VariableMovementActionBuilder
import action.movement.{MovementAction, MovementActionBuilder, MovementActionBuilderInput}

class MaxValueVariableMovementActionBuilder(maxValue: Int
                                            , variableMovementAction: VariableMovementActionBuilder
                                            , constantMovementActionBuilder: ConstantMovementActionBuilder) extends MovementActionBuilder:
  def build(actionBuilderInput: MovementActionBuilderInput): MovementAction =
    MaxValueVariableMovementAction(maxValue
      , variableMovementAction.build(actionBuilderInput)
      , constantMovementActionBuilder.build(actionBuilderInput))