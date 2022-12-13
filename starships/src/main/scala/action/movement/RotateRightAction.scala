package action.movement

import entity.Entity
import gameState.PlayingGameState

case class RotateRightAction(entity: Entity, rotationAngleInDegrees: Double) extends MovementAction(entity):
  def act(gameData: PlayingGameState): PlayingGameState =
    val newMotion = entity.motion.rotateRight
    val newEntity = entity.copy(motion = newMotion)
    gameData.add(newEntity)
