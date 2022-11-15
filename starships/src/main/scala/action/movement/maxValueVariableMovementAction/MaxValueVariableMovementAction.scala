package action.movement.maxValueVariableMovementAction

import action.movement.MovementAction
import action.movement.constantMovementAction.ConstantMovementAction
import action.movement.variableMovementAction.VariableMovementAction
import gameData.Entity

case class MaxValueVariableMovementAction(maxValue: Int
                                          , variableMovementAction: VariableMovementAction
                                          , constantMovementAction: ConstantMovementAction) extends MovementAction :
  def act(entity: Entity): Entity =
    if (entity.motion.direction.dontKnowName >= maxValue) constantMovementAction.act(entity)
    else variableMovementAction.act(entity)
