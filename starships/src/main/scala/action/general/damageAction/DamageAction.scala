package action.general.damageAction

import action.Action
import entity.Entity

case class DamageAction(entity: Entity, damage: Int) extends Action:
  def act: Entity =
    entity.copy(health = entity.health-damage)

