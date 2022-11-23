package spawner

import entity.Entity
import entity.value.EntityType
import entity.value.motion.Motion
import gameData.GameData

trait Spawner:
  def spawn(id: Int, gameData: GameData): Option[Entity]
  
  