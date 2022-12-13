package action.movement

import action.SingleEntityAction
import entity.Entity
import gameState.PlayingGameState

case class MoveForwardAction(entity: Entity) extends SingleEntityAction(entity):
  def act(gameData: PlayingGameState): PlayingGameState =
    val newMotion = entity.motion.moveForward(gameData.secondsSinceLastTime)
    val newEntity = entity.copy(motion = newMotion)
    gameData.add(newEntity)
