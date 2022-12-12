package action.movement.buildingBlocks

import action.movement.{MovementAction, MovementActionBuilder, MovementActionBuilderInput}
import entity.Entity
import gameState.PlayingGameState


case class SpeedReductionMovementAction(deacceleration: Double, entity: Entity) extends MovementAction :
  def act(gameData: PlayingGameState): PlayingGameState =
    val previousMotion = entity.motion
    val previousSpeed = previousMotion.speed
    val newTentativeSpeed = previousSpeed - deacceleration
    val newSpeed = if (newTentativeSpeed <= 0) 0 else newTentativeSpeed
    val newMotion = previousMotion.copy(speed = newSpeed).newMotion
    gameData.add(entity.copy(motion = newMotion))

case class SpeedReductionMovementActionBuilder(deacceleration: Double) extends MovementActionBuilder[SpeedReductionMovementAction]:
  def build(actionBuilderInput: MovementActionBuilderInput): SpeedReductionMovementAction =
    SpeedReductionMovementAction(deacceleration, actionBuilderInput.entity)