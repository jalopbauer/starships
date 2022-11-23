package action.collision.damageAction

import action.collision.CollisionAction
import action.general.damageAction.DamageAction
import entity.Entity
import gameData.GameData

case class CollisionDamageAction(damageAction: DamageAction) extends CollisionAction:
  def act(gameData: GameData): GameData =
    damageAction.act(gameData)

