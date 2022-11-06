package action.spawn

import gameData.Spawner
import action.Action

case class SpawnAction(spawner:Spawner, id:Int = 0) extends Action(id:Int):
  def setId(newId:Int):Action = this.copy(id = newId)