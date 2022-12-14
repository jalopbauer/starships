package action

import entity.Entity
import gameState.PlayingGameState

case class DamageAction(id: Int, damage: Int) extends Action:
  def act(gameData: PlayingGameState): PlayingGameState =
    val entity = gameData.entity(id).get
    val health = entity.health - damage
    val damagedEntity = entity.copy(health = health)
    val playingGameState = gameData.add(damagedEntity)
    if (health > 0) playingGameState
    else playingGameState.killEntity(damagedEntity)
