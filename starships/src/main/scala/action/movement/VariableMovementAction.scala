package action.movement

import action.Action
import gameData.{Entity, KeyStroke, Spawner}

case class VariableMovementAction(gradient: Int) extends MovementAction:
  def act(entity:Entity): Entity =
    val newPosition = entity.motion.position.sum(entity.motion.direction.times(gradient))
    val newMotion = entity.motion.copy(position = newPosition)
    entity.copy(motion = newMotion)