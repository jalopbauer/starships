package action.movement

import action.movement.buildingBlocks.{MaxValueVariableMovementAction, MinValueVariableMovementAction}
import entity.Entity
import entity.value.KeyPress
import entity.value.motion.Coordinate
import gameState.PlayingGameState

import java.lang.Math.*

case class ShipMovementMovementAction(entity: Entity, keyPress: KeyPress
                                      , maxValueVariableMovementAction: MaxValueVariableMovementAction
                                      , slowDownMovementAction: MinValueVariableMovementAction) extends MovementAction :
  def act(gameData: PlayingGameState): PlayingGameState =
    if (gameData.keyPresses.contains(keyPress)) maxValueVariableMovementAction.act(gameData)
    else slowDownMovementAction.act(gameData)
