package action

import entity.Entity
import gameState.PlayingGameState

case class TwoEntitiesDamageEachOtherAction(leftEntityId: Int, rightEntityId: Int) extends Action:
  def act(gameData: PlayingGameState): PlayingGameState =
    val leftEntity = gameData.entity(leftEntityId).get
    val rightEntity = gameData.entity(rightEntityId).get
    DamageAction(leftEntityId, leftEntity.damage).act(DamageAction(rightEntityId, rightEntity.damage).act(gameData))

