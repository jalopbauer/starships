package action.movement.buildingBlocks

import action.movement.{MovementAction, MovementActionBuilder, MovementActionBuilderInput}

class MinValueVariableMovementActionBuilder(maxValue: Int
                                            , variableMovementAction: VariableMovementActionBuilder
                                            , constantMovementActionBuilder: ConstantMovementActionBuilder) extends MovementActionBuilder:
  def build(actionBuilderInput: MovementActionBuilderInput): MovementAction =
    MinValueVariableMovementAction(maxValue
      , variableMovementAction.build(actionBuilderInput)
      , constantMovementActionBuilder.build(actionBuilderInput)
      , actionBuilderInput.entity)