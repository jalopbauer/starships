package gameData

import action.Action
import entity.Entity
import entity.value.{Collision, KeyStroke}
import spawner.Spawner

trait GameData:
  def receiveAction(action: Action):GameData
  def collisions:List[Collision]
  def entities:List[Entity]
  def keyStrokes:List[KeyStroke]
  def spawners:List[Spawner]
