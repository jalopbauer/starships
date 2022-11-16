package action.movement.maxValueVariableMovementAction

import action.Action
import action.movement.MovementAction
import action.movement.constantMovementAction.ConstantMovementAction
import action.movement.variableMovementAction.VariableMovementAction
import gameData.Entity

case class MaxValueVariableMovementAction(maxValue: Int
                                          , variableMovementAction: VariableMovementAction
                                          , constantMovementAction: ConstantMovementAction
                                         , entity: Entity) extends MovementAction:
  def act: Entity =
    if (entity.motion.direction.dontKnowName >= maxValue) constantMovementAction.act
    else variableMovementAction.act
