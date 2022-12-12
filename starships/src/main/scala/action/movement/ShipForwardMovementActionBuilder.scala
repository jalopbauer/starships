package action.movement

import action.movement.buildingBlocks.{MaxValueVariableMovementActionBuilder, SpeedReductionMovementActionBuilder}
import entity.value.KeyPress

case class ShipForwardMovementActionBuilder(keyPress: KeyPress
                                            , maxValueVariableMovementAction: MaxValueVariableMovementActionBuilder
                                            , slowDownMovementAction: SpeedReductionMovementActionBuilder) extends MovementActionBuilder :
  def build(actionBuilderInput: MovementActionBuilderInput): ShipForwardMovementAction =
    ShipForwardMovementAction(actionBuilderInput.entity
      , keyPress
      , maxValueVariableMovementAction.build(actionBuilderInput)
      , slowDownMovementAction.build(actionBuilderInput)
    )
