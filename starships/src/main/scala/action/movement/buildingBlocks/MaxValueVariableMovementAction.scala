package action.movement.buildingBlocks

import action.movement.MovementAction
import entity.Entity
import gameState.PlayingGameState

case class MaxValueVariableMovementAction(maxValue: Int
                                          , variableMovementAction: VariableMovementAction
                                          , constantMovementAction: ConstantMovementAction
                                          , entity: Entity) extends MovementAction :
  def act(gameData: PlayingGameState): PlayingGameState =
    if (entity.motion.speed >= maxValue || entity.motion.speed <= 0) gameData
    else variableMovementAction.act(gameData)
