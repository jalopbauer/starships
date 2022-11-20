package gameData

import action.Action
import entity.Entity
import entity.value.{Collision, KeyPress}
import spawner.Spawner

trait GameData:
  def receiveAction(action: Action):GameData
  def collisions:List[Collision]
  def entities:List[Entity]
  def keyStrokes:List[KeyPress]
  def spawners:List[Spawner]
