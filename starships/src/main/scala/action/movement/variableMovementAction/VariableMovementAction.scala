package action.movement.variableMovementAction

import action.movement.MovementAction
import entity.Entity
import gameData.GameData

case class VariableMovementAction(gradient: Int, entity: Entity) extends MovementAction:
  def act(gameData: GameData): GameData =
    val newPosition = entity.motion.position.sum(entity.motion.direction.times(gradient))
    val newMotion = entity.motion.copy(position = newPosition)
    gameData.add(entity.copy(motion = newMotion))