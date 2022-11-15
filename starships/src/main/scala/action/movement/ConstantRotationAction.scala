package action.movement

import action.Action
import gameData.{Entity, KeyStroke, Spawner}

case class ConstantRotationAction(rotationValueInDegrees: Int) extends MovementAction:
  def act(entity:Entity): Entity =
    val newDegree = entity.motion.degree + rotationValueInDegrees
    val newMotion = entity.motion.copy(degree = newDegree)
    entity.copy(motion = newMotion)