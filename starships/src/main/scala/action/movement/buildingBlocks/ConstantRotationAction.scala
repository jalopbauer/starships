package action.movement.buildingBlocks

import action.movement.{MovementAction, MovementActionBuilder, MovementActionBuilderInput}
import entity.Entity
import gameState.PlayingGameState


case class ConstantRotationAction(rotationValueInDegrees: Double, entity: Entity) extends MovementAction :
  def act(gameData: PlayingGameState): PlayingGameState =
    val newDegree = entity.motion.degree + rotationValueInDegrees
    val newMotion = entity.motion.copy(degree = newDegree)
    gameData.add(entity.copy(motion = newMotion))

class ConstantRotationActionBuilder(rotationValueInDegrees: Double) extends MovementActionBuilder:
  def build(actionBuilderInput: MovementActionBuilderInput): ConstantRotationAction =
    ConstantRotationAction(rotationValueInDegrees, actionBuilderInput.entity)