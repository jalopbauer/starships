package action.movement.constantMovementAction

import action.movement.MovementAction
import gameData.Entity

case class ConstantMovementAction() extends MovementAction :
  def act(entity: Entity): Entity =
    val motion = entity.motion
    val direction = motion.direction
    val position = motion.position
    val newPosition = position.sum(direction)
    val newMotion = motion.copy(position = newPosition)
    entity.copy(motion = newMotion)
