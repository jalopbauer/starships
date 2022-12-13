package action.collision

import action.DamageAction
import gameState.PlayingGameState

case class CollisionDamageAction(damageAction: DamageAction) extends CollisionAction :
  def act(gameData: PlayingGameState): PlayingGameState =
    damageAction.act(gameData)
