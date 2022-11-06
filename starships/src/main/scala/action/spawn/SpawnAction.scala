package action.spawn

import gameData.{Entity, Spawner}
import action.Action

case class SpawnAction(spawner: Spawner) extends Action(spawner.id):
  var  id: Int = spawner.id
  def setId(newId:Int): Action = this.copy(spawner.copy(id = newId))
  def act(): Entity =
    Entity(spawner.id, spawner.entityType, spawner.motion)