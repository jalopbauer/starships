package action.collision.damageAction

import action.collision.CollisionAction
import action.general.damageAction.DamageAction
import entity.Entity

case class CollisionDamageAction(damageAction: DamageAction) extends CollisionAction:
  def act: Entity =
    damageAction.act

