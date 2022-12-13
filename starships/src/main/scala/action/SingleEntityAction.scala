package action

import entity.Entity
import gameState.PlayingGameState

trait SingleEntityAction(entity: Entity) extends Action:
  def act(gameData: PlayingGameState): PlayingGameState