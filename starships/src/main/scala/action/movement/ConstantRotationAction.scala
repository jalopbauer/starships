package action.movement

import entity.Entity
import gameState.PlayingGameState

case class ConstantRotationAction(rotationValueInDegrees: Int, entity: Entity) extends MovementAction :
  def act(gameData: PlayingGameState): PlayingGameState =
    val newDegree = entity.motion.degree + rotationValueInDegrees
    val newMotion = entity.motion.copy(degree = newDegree)
    gameData.add(entity.copy(motion = newMotion))
