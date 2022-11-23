package action.general.damageAction

import action.Action
import entity.Entity
import gameData.GameData

case class DamageAction(entity: Entity, damage: Int) extends Action:
  def act(gameData: GameData): GameData =
    gameData.add(entity.copy(health = entity.health-damage))

