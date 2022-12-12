package action.movement.buildingBlocks

import action.movement.{MovementAction, MovementActionBuilder, MovementActionBuilderInput}
import entity.Entity
import entity.value.motion.Coordinate
import gameState.PlayingGameState

case class AccelerationMovementAction(entity: Entity, acceleration: Double) extends MovementAction :
  def act(gameData: PlayingGameState): PlayingGameState =
    val motion = entity.motion
    val speed = motion.speed
    val angleInDegrees = motion.angleInDegrees
//    val newMotion
    gameData.add(entity.copy())

  def calculateSpeedWithAcceleration(speed: Coordinate, angleInDegrees: Double, acceleration: Double): Coordinate =
    val newSpeedAxisX = Math.cos(Math.toRadians(angleInDegrees + 90)) * acceleration + speed.x
    val newSpeedAxisY = Math.sin(Math.toRadians(angleInDegrees + 90)) * acceleration + speed.y
    Coordinate(newSpeedAxisX, newSpeedAxisY)
//
//case class ConstantMovementActionBuilder() extends MovementActionBuilder:
//  def build(actionBuilderInput: MovementActionBuilderInput): ConstantMovementAction =
//    ConstantMovementAction(actionBuilderInput.entity)