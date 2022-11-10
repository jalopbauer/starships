package action

import gameData.Entity

trait Action():
  def act(entity:Entity): Entity