package action.collision

import action.ActionBuilder

trait CollisionActionBuilder() extends ActionBuilder[CollisionActionBuilderInput, CollisionAction]:
  def build(actionBuilderInput: CollisionActionBuilderInput): CollisionAction