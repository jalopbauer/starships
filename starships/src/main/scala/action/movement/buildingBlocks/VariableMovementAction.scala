package action.movement.buildingBlocks

import action.movement.{MovementAction, MovementActionBuilder, MovementActionBuilderInput}
import entity.Entity
import gameState.PlayingGameState

case class VariableMovementAction(acceleration: Double, entity: Entity) extends MovementAction :
  def act(gameData: PlayingGameState): PlayingGameState =
    val previousMotion = entity.motion
    val previousSpeed = previousMotion.speed
    val newTentativeSpeed = previousSpeed + acceleration
    val newSpeed = if (newTentativeSpeed <= 0) 0 else newTentativeSpeed
    val newMotion = previousMotion.copy(speed = newSpeed).newMotion
    gameData.add(entity.copy(motion = newMotion))

case class VariableMovementActionBuilder(gradient: Double) extends MovementActionBuilder[VariableMovementAction]:
  def build(actionBuilderInput: MovementActionBuilderInput): VariableMovementAction =
    VariableMovementAction(gradient, actionBuilderInput.entity)