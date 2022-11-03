package gameData

import action.Action

trait GameData:
  def receiveAction(action: Action):GameData
