package action

import gameData.Entity

trait Action():
  def act(id:Int): Entity