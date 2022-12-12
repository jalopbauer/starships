package action.movement

import action.movement.buildingBlocks.{MaxValueVariableMovementAction, MaxValueVariableMovementActionBuilder, SpeedReductionMovementAction, SpeedReductionMovementActionBuilder}
import entity.Entity
import entity.value.KeyPress
import gameState.PlayingGameState

case class ShipBreakMovementAction(entity: Entity, keyPress: KeyPress
                                   , slowDownMovementAction: SpeedReductionMovementAction) extends MovementAction :
  def act(gameData: PlayingGameState): PlayingGameState =
    slowDownMovementAction.act(gameData)

case class ShipBreakMovementActionBuilder(keyPress: KeyPress
                                          , slowDownMovementAction: SpeedReductionMovementActionBuilder
                                           ) extends MovementActionBuilder[ShipBreakMovementAction] :
  def build(actionBuilderInput: MovementActionBuilderInput): ShipBreakMovementAction =
    ShipBreakMovementAction(actionBuilderInput.entity
      , keyPress
      , slowDownMovementAction.build(actionBuilderInput)
    )