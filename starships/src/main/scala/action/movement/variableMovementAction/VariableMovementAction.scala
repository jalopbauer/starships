package action.movement.variableMovementAction

import action.movement.MovementAction
import gameData.Entity

case class VariableMovementAction(gradient: Int, entity: Entity) extends MovementAction:
  def act: Entity =
    val newPosition = entity.motion.position.sum(entity.motion.direction.times(gradient))
    val newMotion = entity.motion.copy(position = newPosition)
    entity.copy(motion = newMotion)
