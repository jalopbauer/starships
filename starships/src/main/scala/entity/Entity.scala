package entity

import entity.value.{EntityType, Shape}
import entity.value.motion.Motion

case class Entity(id: Int, entityType: EntityType, motion: Motion, damage: Int, health: Int, shape: Shape):

  def saveString: String =
    s"$id^${entityType.toString}^${motion.saveString}^$damage^$health^${shape.saveString}"