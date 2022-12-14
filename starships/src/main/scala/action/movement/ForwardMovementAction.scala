package action.movement

import entity.Entity
import gameState.PlayingGameState

case class ForwardMovementAction(id: Int) extends MovementAction:
  def act(gameData: PlayingGameState): PlayingGameState =
    val entity = gameData.entity(id).get
    val newMotion = entity.motion.moveForward(gameData.secondsSinceLastTime)
    val newEntity = entity.copy(motion = newMotion)
    gameData.add(newEntity)
