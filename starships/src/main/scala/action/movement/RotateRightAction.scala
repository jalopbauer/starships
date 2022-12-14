package action.movement

import entity.Entity
import gameState.PlayingGameState

case class RotateRightAction(id: Int) extends MovementAction:
  def act(gameData: PlayingGameState): PlayingGameState =
    val entity = gameData.entity(id).get
    val newMotion = entity.motion.rotateRight
    val newEntity = entity.copy(motion = newMotion)
    gameData.add(newEntity)
