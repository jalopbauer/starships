package action.movement

import action.Action
import gameData.{Entity, KeyStroke, Spawner}

case class VariableMovementAction(id:Int, gradient: Int) extends MovementAction(id, List()):
  def act(entity:Entity): Entity =
    val newPosition = entity.motion.position.sum(entity.motion.direction.times(gradient))
    val newMotion = entity.motion.copy(position = newPosition)
    entity.copy(motion = newMotion)