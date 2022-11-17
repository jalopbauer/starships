package action.movement.constantRotationAction

import action.movement.MovementAction
import entity.Entity

case class ConstantRotationAction(rotationValueInDegrees: Int, entity: Entity) extends MovementAction :
  def act: Entity =
    val newDegree = entity.motion.degree + rotationValueInDegrees
    val newMotion = entity.motion.copy(degree = newDegree)
    entity.copy(motion = newMotion)
