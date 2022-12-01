package action.collision.damageAction

import action.collision.CollisionAction
import action.general.damageAction.DamageAction
import entity.Entity
import gameData.PlayingGameData

case class CollisionDamageAction(damageAction: DamageAction) extends CollisionAction:
  def act(gameData: PlayingGameData): PlayingGameData =
    damageAction.act(gameData)

