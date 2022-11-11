package action.movement

import action.Action
import gameData.{Entity, KeyStroke, Spawner}

case class ConstantMovementAction(id:Int) extends MovementAction(id):
  def act(entity:Entity): Entity =
    val motion = entity.motion
    val direction = motion.direction
    val position = motion.position
    val newPosition = position.sum(direction)
    val newMotion = motion.copy(position = newPosition)
    entity.copy(motion = newMotion)