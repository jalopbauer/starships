package action

trait ActionBuilder[T <: ActionBuilderInput, S <: Action]:
  def build(actionBuilderInput: T): S