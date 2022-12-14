package action.movement

import entity.Entity
import gameState.PlayingGameState

case class MoveAction(entity: Entity) extends MovementAction:
  def act(gameData: PlayingGameState): PlayingGameState =
    val newMotion = entity.motion.move()
    val newEntity = entity.copy(motion = newMotion)
    gameData.add(newEntity)
