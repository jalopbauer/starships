package gameData

import action.Action

trait GameData:
  def receiveAction(action: Action):GameData
  def collisions:List[Collision]
  def entities:List[Entity]
  def keyStrokes:List[KeyStroke]
