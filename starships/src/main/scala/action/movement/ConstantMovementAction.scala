package action.movement

import action.Action
import gameData.{Entity, KeyStroke, Spawner}

case class ConstantMovementAction(id:Int, keyStrokes:List[KeyStroke]) extends MovementAction(id, keyStrokes):
  def act(entity:Entity): Entity =
    entity