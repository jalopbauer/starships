package action.collision.damageAction

import action.collision.{CollisionAction, CollisionActionBuilder, CollisionActionBuilderInput}
import action.general.damageAction.DamageAction

class CollisionDamageActionBuilder extends CollisionActionBuilder:
  def build(actionBuilderInput: CollisionActionBuilderInput): CollisionDamageAction =
    CollisionDamageAction(DamageAction(actionBuilderInput.actionReceiver, actionBuilderInput.actionEmitter.damage))
