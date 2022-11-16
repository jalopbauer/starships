package action.collision.damageAction

import action.collision.CollisionAction
import gameData.Entity
import action.general.damageAction.DamageAction

case class CollisionDamageAction(damageAction: DamageAction) extends CollisionAction:
  def act: Entity =
    damageAction.act

