package spawner

import gameData.Entity
import gameData.motion.Motion
import gameData.value.EntityType

trait Spawner(id: Int, entityType: EntityType, motion: Motion, damage: Int, health: Int):
  def spawn: Option[Entity]