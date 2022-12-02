package action.general.damageAction

import action.Action
import entity.Entity
import gameState.PlayingGameState

case class DamageAction(entity: Entity, damage: Int) extends Action:
  def act(gameData: PlayingGameState): PlayingGameState =
    gameData.add(entity.copy(health = entity.health-damage))

