package action.movement

import action.SingleEntityAction
import entity.Entity
import gameState.PlayingGameState

case class BackwardMovementAction(entity: Entity) extends MovementAction with SingleEntityAction(entity):
  def act(gameData: PlayingGameState): PlayingGameState =
    val newMotion = entity.motion.moveBackward(gameData.secondsSinceLastTime)
    val newEntity = entity.copy(motion = newMotion)
    gameData.add(newEntity)
