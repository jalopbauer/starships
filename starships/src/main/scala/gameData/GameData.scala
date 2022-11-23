package gameData

import action.Action
import entity.Entity
import entity.value.{Collision, KeyPress}
import spawner.Spawner

case class GameData(collisions: List[Collision]
                    , entitiesMap: Map[Int, Entity]
                    , keyPresses: List[KeyPress]
                    , spawners: List[Spawner]
                    , modifiedEntitiesSet: Set[Int]):

  def entities: List[Entity] = entitiesMap.values.toList

  def flush(): GameData =
    this.copy(collisions = List(), keyPresses = List(), modifiedEntitiesSet = Set())

  
  def add(collision: Collision): GameData =
    this.copy(collisions = collision :: collisions)

  def add(keyPress: KeyPress): GameData =
    this.copy(keyPresses = keyPress :: keyPresses)

  def add(entity: Entity): GameData =
    this.copy(entitiesMap = entitiesMap + (entity.id -> entity), modifiedEntitiesSet = modifiedEntitiesSet + entity.id)
