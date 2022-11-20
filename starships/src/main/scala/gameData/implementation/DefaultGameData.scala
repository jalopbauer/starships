package gameData.implementation

import action.Action
import entity.Entity
import entity.value.{Collision, KeyPress}
import gameData.GameData
import spawner.Spawner

case class DefaultGameData(collisions: List[Collision]
                          , entitiesMap: Map[Int, Entity]
                          , keyStrokes: List[KeyPress]
                          , spawners: List[Spawner]) extends GameData:

  def receiveAction(action: Action): GameData =
    val entity = action.act
    this.copy(entitiesMap = entitiesMap + (entity.id -> entity))

  def entities: List[Entity] = entitiesMap.values.toList
