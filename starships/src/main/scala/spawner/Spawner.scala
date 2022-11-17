package spawner

import gameData.Entity
import gameData.value.EntityType
import gameData.value.motion.Motion

trait Spawner(id: Int, entityType: EntityType, motion: Motion, damage: Int, health: Int):
  def spawn: Option[Entity]