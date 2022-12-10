package action.movement

import entity.Entity
import entity.value.motion.Coordinate
import gameState.PlayingGameState

case class VariableMovementAction(gradient: Int, entity: Entity) extends MovementAction :
  def act(gameData: PlayingGameState): PlayingGameState =
    val previousMotion = entity.motion
    val previousDirection = previousMotion.direction
    val previousPosition = previousMotion.position

    val coordinateGradient = Coordinate(gradient,gradient)

    val newDirection = previousDirection.sum(coordinateGradient)
    val newPosition = previousPosition.sum(newDirection)
    val newMotion = previousMotion.copy(position = newPosition, direction = newDirection)
    println(newMotion)
    gameData.add(entity.copy(motion = newMotion))
