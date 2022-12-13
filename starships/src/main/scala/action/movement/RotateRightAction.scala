package action.movement

import action.SingleEntityAction
import entity.Entity
import gameState.PlayingGameState

case class RotateRightAction(entity: Entity, rotationAngleInDegrees: Double) extends MovementAction with SingleEntityAction(entity):
  def act(gameData: PlayingGameState): PlayingGameState =
    val newMotion = entity.motion.rotateRight
    val newEntity = entity.copy(motion = newMotion)
    gameData.add(newEntity)
