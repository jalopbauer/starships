package action.spawn

import gameData.{Entity, Spawner}
import action.Action

case class SpawnAction(spawner: Spawner) extends Action:
  var  id: Int = spawner.id
  def act(id:Int): Entity =
    Entity(id, spawner.entityType, spawner.motion)