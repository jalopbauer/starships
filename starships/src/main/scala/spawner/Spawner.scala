package spawner

import entity.Entity
import entity.value.EntityType
import entity.value.motion.Motion

trait Spawner(id: Int, entityType: EntityType, motion: Motion, damage: Int, health: Int):
  def spawn: Option[Entity]