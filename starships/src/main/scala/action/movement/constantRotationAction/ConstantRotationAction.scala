package action.movement.constantRotationAction

import action.movement.MovementAction
import entity.Entity
import gameData.GameData

case class ConstantRotationAction(rotationValueInDegrees: Int, entity: Entity) extends MovementAction :
  def act(gameData: GameData): GameData =
    val newDegree = entity.motion.degree + rotationValueInDegrees
    val newMotion = entity.motion.copy(degree = newDegree)
    gameData.add(entity.copy(motion = newMotion))
