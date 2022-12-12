package action.movement

import Math.*
import entity.Entity
import entity.value.motion.Coordinate
import gameState.PlayingGameState

case class ConstantMovementAction(entity: Entity) extends MovementAction :
  def act(gameData: PlayingGameState): PlayingGameState =
    val newMotion = entity.motion.newMotion
    gameData.add(entity.copy(motion = newMotion))
