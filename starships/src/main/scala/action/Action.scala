package action

import entity.Entity
import gameData.PlayingGameData

trait Action:
  def act(gameData: PlayingGameData): PlayingGameData