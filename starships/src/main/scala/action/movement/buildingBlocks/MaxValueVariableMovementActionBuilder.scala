package action.movement.buildingBlocks

import action.movement.{MovementAction, MovementActionBuilder, MovementActionBuilderInput}

class MaxValueVariableMovementActionBuilder(maxValue: Int
                                            , variableMovementAction: VariableMovementActionBuilder
                                            , constantMovementActionBuilder: ConstantMovementActionBuilder) extends MovementActionBuilder:
  def build(actionBuilderInput: MovementActionBuilderInput): MaxValueVariableMovementAction =
    MaxValueVariableMovementAction(maxValue
      , variableMovementAction.build(actionBuilderInput)
      , constantMovementActionBuilder.build(actionBuilderInput)
      , actionBuilderInput.entity)