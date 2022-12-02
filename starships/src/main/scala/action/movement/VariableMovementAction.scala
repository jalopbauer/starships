package action.movement

import entity.Entity
import gameState.PlayingGameState

case class VariableMovementAction(gradient: Int, entity: Entity) extends MovementAction :
  def act(gameData: PlayingGameState): PlayingGameState =
    val newPosition = entity.motion.position.sum(entity.motion.direction.times(gradient))
    val newMotion = entity.motion.copy(position = newPosition)
    gameData.add(entity.copy(motion = newMotion))
