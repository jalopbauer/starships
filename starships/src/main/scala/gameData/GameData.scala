package gameData

import action.Action
import entity.Entity
import entity.value.{Collision, KeyPress, EntityType}
import seed.Seed
import spawner.Spawner

case class GameData(collisions: List[Collision]
                    , entitiesMap: Map[Int, Entity]
                    , keyPresses: List[KeyPress]
                    , spawners: List[Spawner]
                    , modifiedEntitiesSet: Set[Int]
                    , seed: Seed):

  def entities: List[Entity] = entitiesMap.values.toList

  def flush(): GameData =
    this.copy(collisions = List(), keyPresses = List(), modifiedEntitiesSet = Set())

  def ships:List[Entity] =
    entities.filter(_.entityType.equals(EntityType.SHIP))

  def add(collision: Collision): GameData =
    this.copy(collisions = collision :: collisions)

  def add(keyPress: KeyPress): GameData =
    this.copy(keyPresses = keyPress :: keyPresses)

  def add(entity: Entity): GameData =
    this.copy(entitiesMap = entitiesMap + (entity.id -> entity), modifiedEntitiesSet = modifiedEntitiesSet + entity.id)

object GameData:
  def apply(entitiesMap: Map[Int, Entity]
            , spawners: List[Spawner]
            , seed: Seed): GameData =
    GameData(List(), entitiesMap, List(), spawners, Set(), seed)