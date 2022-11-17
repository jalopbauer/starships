package action.movement.constantMovementAction

import action.Action
import action.movement.MovementAction
import entity.Entity

case class ConstantMovementAction(entity: Entity) extends MovementAction:
  def act: Entity =
    val motion = entity.motion
    val direction = motion.direction
    val position = motion.position
    val newPosition = position.sum(direction)
    val newMotion = motion.copy(position = newPosition)
    entity.copy(motion = newMotion)
