package action.insideBorder

import entity.Entity
import entity.value.motion.Coordinate
import gameState.PlayingGameState

case class RemoveEntityOutsideBorderAction(id: Int, border: Int) extends InsideBorderAction(id, border):
  def act(gameData: PlayingGameState): PlayingGameState =
    val entity = gameData.entity(id).get
    val position = entity.motion.position
    val isOutside  = position.x - border > 0 || position.y - border > 0 || position.y < 0 || position.x < 0
    if (isOutside) gameData.killEntity(entity)
    else gameData