package action

import gameData.Entity

trait Action(id:Int):
  def setId(newId:Int):Action
  def act(): Entity