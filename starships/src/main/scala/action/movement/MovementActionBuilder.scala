package action.movement

import action.ActionBuilder

trait MovementActionBuilder() extends ActionBuilder[MovementActionBuilderInput, MovementAction]:
  def build(actionBuilderInput: MovementActionBuilderInput): MovementAction