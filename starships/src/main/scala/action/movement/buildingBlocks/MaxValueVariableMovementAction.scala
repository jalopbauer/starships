package action.movement.buildingBlocks

import action.movement.{MovementAction, MovementActionBuilder, MovementActionBuilderInput}
import entity.Entity
import gameState.PlayingGameState

case class MaxValueVariableMovementAction(maxValue: Int
                                          , variableMovementAction: VariableMovementAction
                                          , constantMovementAction: ConstantMovementAction
                                          , entity: Entity) extends MovementAction :
  def act(gameData: PlayingGameState): PlayingGameState =
    if (entity.motion.speed >= maxValue || entity.motion.speed <= 0) gameData
    else variableMovementAction.act(gameData)

case class MaxValueVariableMovementActionBuilder(maxValue: Int
                                                 , variableMovementAction: VariableMovementActionBuilder
                                                 , constantMovementActionBuilder: ConstantMovementActionBuilder
                                                ) extends MovementActionBuilder:
  def build(actionBuilderInput: MovementActionBuilderInput): MaxValueVariableMovementAction =
    MaxValueVariableMovementAction(maxValue
      , variableMovementAction.build(actionBuilderInput)
      , constantMovementActionBuilder.build(actionBuilderInput)
      , actionBuilderInput.entity
    )