package entity

import entity.value.{EntityType, Shape}
import entity.value.motion.Motion

case class Entity(id: Int, entityType: EntityType, motion: Motion, damage: Int, health: Int, shape: Shape):

  def saveString: String =
    s"$id&${entityType.toString}&${motion.saveString}&$damage&$health&${shape.saveString}"

case object Entity:
  def stringToEntity(string: String): Entity =
    val array = string.split('&')
    val entityType = array(1) match
      case "ASTEROID" => EntityType.ASTEROID
      case "SHIP" => EntityType.SHIP
      case "SHOT" => EntityType.SHOT
    Entity(array(0).toInt, entityType, Motion.stringToMotion(array(2)), array(3).toInt, array(4).toInt, Shape.stringToShape(array(5)))
