package action.collision

case class CollisionDamageActionBuilder() extends CollisionActionBuilder :
  def build(actionBuilderInput: CollisionActionBuilderInput): CollisionDamageAction =
    CollisionDamageAction(DamageAction(actionBuilderInput.actionReceiver, actionBuilderInput.actionEmitter.damage))
