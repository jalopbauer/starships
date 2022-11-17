package action.movement

import action.Action
import gameData.Entity
import gameData.value.KeyStroke

trait MovementAction() extends Action:
  def entity: Entity
