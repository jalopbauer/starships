package action.spawn

import gameData.Entity
import action.Action
import spawner.Spawner

case class SpawnAction(spawner: Spawner) extends Action:
  def act: Entity =
    spawner.spawn.get