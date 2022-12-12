package action.movement

case class VariableMovementActionBuilder(gradient: Double) extends MovementActionBuilder :
  def build(actionBuilderInput: MovementActionBuilderInput): VariableMovementAction =
    VariableMovementAction(gradient, actionBuilderInput.entity)
