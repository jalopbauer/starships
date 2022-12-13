package action.movement

import entity.Entity
import gameState.PlayingGameState

case class RotateLeftAction(entity: Entity, rotationAngleInDegrees: Double) extends MovementAction:
  def act(gameData: PlayingGameState): PlayingGameState =
    val newMotion = entity.motion.rotateLeft
    val newEntity = entity.copy(motion = newMotion)
    gameData.add(newEntity)
