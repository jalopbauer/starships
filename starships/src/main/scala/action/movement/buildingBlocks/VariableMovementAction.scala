package action.movement.buildingBlocks

import action.movement.MovementAction
import entity.Entity
import gameState.PlayingGameState

case class VariableMovementAction(acceleration: Double, entity: Entity) extends MovementAction :
  def act(gameData: PlayingGameState): PlayingGameState =
    val previousMotion = entity.motion
    val previousSpeed = previousMotion.speed
    val newSpeed = previousSpeed + acceleration
    val newMotion = previousMotion.copy(speed = newSpeed).newMotion
    gameData.add(entity.copy(motion = newMotion))
