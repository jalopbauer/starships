package action.movement

case class VariableMovementActionBuilder(gradient: Int) extends MovementActionBuilder :
  def build(actionBuilderInput: MovementActionBuilderInput): VariableMovementAction =
    VariableMovementAction(gradient, actionBuilderInput.entity)
