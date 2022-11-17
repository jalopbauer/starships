package action.movement

import action.Action
import entity.Entity
import entity.value.KeyStroke

trait MovementAction() extends Action:
  def entity: Entity
