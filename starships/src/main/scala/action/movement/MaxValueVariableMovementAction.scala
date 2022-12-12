package action.movement

import entity.Entity
import gameState.PlayingGameState

case class MaxValueVariableMovementAction(maxValue: Int
                                          , variableMovementAction: VariableMovementAction
                                          , constantMovementAction: ConstantMovementAction
                                          , entity: Entity) extends MovementAction :
  def act(gameData: PlayingGameState): PlayingGameState =
    if (entity.motion.speed >= maxValue) gameData
    else variableMovementAction.act(gameData)
