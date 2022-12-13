package action

import entity.Entity
import gameState.PlayingGameState

trait DoubleEntityAction(leftEntity: Entity, rightEntity: Entity) extends Action:
  def act(gameData: PlayingGameState): PlayingGameState