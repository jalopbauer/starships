package action.movement

case class ConstantMovementActionBuilder() extends MovementActionBuilder :
  def build(actionBuilderInput: MovementActionBuilderInput): ConstantMovementAction =
    ConstantMovementAction(actionBuilderInput.entity)
