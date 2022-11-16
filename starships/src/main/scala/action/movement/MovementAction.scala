package action.movement

import action.Action
import gameData.{Entity, KeyStroke}

trait MovementAction() extends Action:
  def entity: Entity
