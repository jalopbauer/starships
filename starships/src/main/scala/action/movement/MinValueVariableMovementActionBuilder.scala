package action.movement

import action.movement.{ConstantMovementActionBuilder, MovementAction, MovementActionBuilder, MovementActionBuilderInput}

class MinValueVariableMovementActionBuilder(maxValue: Int
                                            , variableMovementAction: VariableMovementActionBuilder
                                            , constantMovementActionBuilder: ConstantMovementActionBuilder) extends MovementActionBuilder:
  def build(actionBuilderInput: MovementActionBuilderInput): MovementAction =
    MinValueVariableMovementAction(maxValue
      , variableMovementAction.build(actionBuilderInput)
      , constantMovementActionBuilder.build(actionBuilderInput)
      , actionBuilderInput.entity)