package spawner

import entity.Entity
import gameData.GameData
class AsteroidSpawner extends Spawner:
  def spawn(id: Int, gameData: GameData): Option[Entity] =
    None