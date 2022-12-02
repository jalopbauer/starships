package action.collision.damageAction

import action.collision.CollisionAction
import action.general.damageAction.DamageAction
import entity.Entity
import gameState.PlayingGameState

case class CollisionDamageAction(damageAction: DamageAction) extends CollisionAction:
  def act(gameData: PlayingGameState): PlayingGameState =
    damageAction.act(gameData)

