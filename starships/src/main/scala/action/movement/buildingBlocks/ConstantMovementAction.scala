package action.movement.buildingBlocks

import action.movement.MovementAction
import entity.Entity
import gameState.PlayingGameState

case class ConstantMovementAction(entity: Entity) extends MovementAction :
  def act(gameData: PlayingGameState): PlayingGameState =
    val newMotion = entity.motion.newMotion
    gameData.add(entity.copy(motion = newMotion))
