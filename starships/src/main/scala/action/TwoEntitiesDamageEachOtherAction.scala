package action

import entity.Entity
import gameState.PlayingGameState

case class TwoEntitiesDamageEachOtherAction(leftEntity: Entity, rightEntity: Entity) extends DoubleEntityAction(leftEntity: Entity, rightEntity: Entity) :
  def act(gameData: PlayingGameState): PlayingGameState =
    DamageAction(rightEntity, leftEntity.damage).act(DamageAction(leftEntity, rightEntity.damage).act(gameData))

