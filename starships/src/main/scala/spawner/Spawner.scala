package spawner

import gameData.{Entity, EntityType}
import gameData.motion.Motion

trait Spawner(id: Int, entityType: EntityType, motion: Motion, damage: Int, health: Int):
  def spawn: Option[Entity]