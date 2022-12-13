package action.movement

import action.SingleEntityAction
import entity.Entity
import gameState.PlayingGameState

case class RotateLeftAction(entity: Entity, rotationAngleInDegrees: Double) extends SingleEntityAction(entity):
  def act(gameData: PlayingGameState): PlayingGameState =
    val newMotion = entity.motion.rotateLeft
    val newEntity = entity.copy(motion = newMotion)
    gameData.add(newEntity)
