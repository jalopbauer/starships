package gameData

import action.Action
import entity.Entity
import entity.value.{Collision, KeyPress}
import spawner.Spawner

case class GameData(collisions: List[Collision]
                    , entitiesMap: Map[Int, Entity]
                    , keyPresses: List[KeyPress]
                    , spawners: List[Spawner]
                    , modifiedEntitiesMap: Map[Int, Entity]):

  def receiveAction(action: Action): GameData =
    val entity = action.act
    this.copy(modifiedEntitiesMap = entitiesMap + (entity.id -> entity))

  def entities: List[Entity] = entitiesMap.values.toList
