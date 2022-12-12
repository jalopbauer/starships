package action.movement

import action.movement.buildingBlocks.{MaxValueVariableMovementAction, SpeedReductionMovementAction}
import entity.Entity
import entity.value.KeyPress
import entity.value.motion.Coordinate
import gameState.PlayingGameState

case class ShipForwardMovementAction(entity: Entity, keyPress: KeyPress
                                     , maxValueVariableMovementAction: MaxValueVariableMovementAction
                                     , slowDownMovementAction: SpeedReductionMovementAction) extends MovementAction :
  def act(gameData: PlayingGameState): PlayingGameState =
    if (gameData.keyPresses.contains(keyPress)) maxValueVariableMovementAction.act(gameData)
    else slowDownMovementAction.act(gameData)
