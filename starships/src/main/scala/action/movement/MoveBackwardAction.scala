package action.movement

import entity.Entity
import gameState.PlayingGameState

case class MoveBackwardAction(entity: Entity) extends MovementAction(entity):
  def act(gameData: PlayingGameState): PlayingGameState =
    val newMotion = entity.motion.moveBackward(gameData.secondsSinceLastTime)
    val newEntity = entity.copy(motion = newMotion)
    gameData.add(newEntity)