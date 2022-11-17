package action.spawn

import action.Action
import entity.Entity
import spawner.Spawner

case class SpawnAction(spawner: Spawner) extends Action:
  def act: Entity =
    spawner.spawn.get