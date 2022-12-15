package action.insideBorder

import entity.Entity
import entity.value.motion.Coordinate
import gameState.PlayingGameState

case class SetEntityInsideBorderAction(id: Int, border: Int) extends InsideBorderAction(id, border):
  def act(gameData: PlayingGameState): PlayingGameState =
    val entity = gameData.entity(id).get
    val motion = entity.motion
    val position = motion.position
    val newX =
      if (position.x - border > 0)
        position.x - border
      else if(position.x < 0 )
        border - position.x
      else position.x
    val newY =
      if (position.y - border > 0)
        position.y - border
      else if(position.y < 0 )
        border - position.y
      else position.y
    gameData.add(entity.copy(motion = motion.copy(position = Coordinate(newX, newY))))