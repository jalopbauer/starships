package action.movement

import action.Action
import entity.Entity

trait MovementAction() extends Action:
  def entity: Entity
