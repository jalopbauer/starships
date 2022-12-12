package action.movement

import action.movement.buildingBlocks.{MaxValueVariableMovementAction, MaxValueVariableMovementActionBuilder, SpeedReductionMovementAction, SpeedReductionMovementActionBuilder}
import entity.Entity
import entity.value.KeyPress
import gameState.PlayingGameState

case class ShipForwardMovementAction(entity: Entity, keyPress: KeyPress
                                     , maxValueVariableMovementAction: MaxValueVariableMovementAction
                                     , slowDownMovementAction: SpeedReductionMovementAction) extends MovementAction :
  def act(gameData: PlayingGameState): PlayingGameState =
    if (gameData.keyPresses.contains(keyPress)) maxValueVariableMovementAction.act(gameData)
    else slowDownMovementAction.act(gameData)

case class ShipForwardMovementActionBuilder(
                                             keyPress: KeyPress
                                            , maxValueVariableMovementAction: MaxValueVariableMovementActionBuilder
                                            , slowDownMovementAction: SpeedReductionMovementActionBuilder
                                           ) extends MovementActionBuilder[ShipForwardMovementAction] :
  def build(actionBuilderInput: MovementActionBuilderInput): ShipForwardMovementAction =
    ShipForwardMovementAction(actionBuilderInput.entity
      , keyPress
      , maxValueVariableMovementAction.build(actionBuilderInput)
      , slowDownMovementAction.build(actionBuilderInput)
    )