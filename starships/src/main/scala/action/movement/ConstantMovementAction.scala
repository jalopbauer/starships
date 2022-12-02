package action.movement

import entity.Entity
import gameState.PlayingGameState

case class ConstantMovementAction(entity: Entity) extends MovementAction :
  def act(gameData: PlayingGameState): PlayingGameState =
    val motion = entity.motion
    val direction = motion.direction
    val position = motion.position
    val newPosition = position.sum(direction)
    val newMotion = motion.copy(position = newPosition)
    gameData.add(entity.copy(motion = newMotion))
