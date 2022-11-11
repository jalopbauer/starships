package action.movement

import action.Action
import gameData.{Entity, KeyStroke, Spawner}

case class ConstantRotationAction(id:Int, rotationValueInDegrees: Int) extends MovementAction(id):
  def act(entity:Entity): Entity =
    val newDegree = entity.motion.degree + rotationValueInDegrees
    val newMotion = entity.motion.copy(degree = newDegree)
    entity.copy(motion = newMotion)