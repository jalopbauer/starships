package action

import entity.Entity
import gameData.GameData

trait Action:
  def act(gameData: GameData): GameData