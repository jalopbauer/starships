package action.movement.maxValueVariableMovementAction

import action.Action
import action.movement.MovementAction
import action.movement.constantMovementAction.ConstantMovementAction
import action.movement.variableMovementAction.VariableMovementAction
import entity.Entity
import gameData.GameData

case class MaxValueVariableMovementAction(maxValue: Int
                                          , variableMovementAction: VariableMovementAction
                                          , constantMovementAction: ConstantMovementAction
                                         , entity: Entity) extends MovementAction:
  def act(gameData: GameData): GameData =
    if (entity.motion.direction.dontKnowName >= maxValue) constantMovementAction.act(gameData)
    else variableMovementAction.act(gameData)