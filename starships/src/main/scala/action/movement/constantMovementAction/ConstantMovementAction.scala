package action.movement.constantMovementAction

import action.Action
import action.movement.MovementAction
import entity.Entity
import gameData.GameData

case class ConstantMovementAction(entity: Entity) extends MovementAction:
  def act(gameData: GameData): GameData =
    val motion = entity.motion
    val direction = motion.direction
    val position = motion.position
    val newPosition = position.sum(direction)
    val newMotion = motion.copy(position = newPosition)
    gameData.add(entity.copy(motion = newMotion))


