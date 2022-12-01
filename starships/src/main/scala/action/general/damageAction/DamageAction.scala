package action.general.damageAction

import action.Action
import entity.Entity
import gameData.PlayingGameData

case class DamageAction(entity: Entity, damage: Int) extends Action:
  def act(gameData: PlayingGameData): PlayingGameData =
    gameData.add(entity.copy(health = entity.health-damage))

