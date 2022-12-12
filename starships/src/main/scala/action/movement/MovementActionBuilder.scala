package action.movement

import action.ActionBuilder

trait MovementActionBuilder[T <: MovementAction]() extends ActionBuilder[MovementActionBuilderInput, T]:
  def build(actionBuilderInput: MovementActionBuilderInput): T