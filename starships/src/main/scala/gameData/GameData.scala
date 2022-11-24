package gameData

import action.Action
import entity.Entity
import entity.value.{Collision, EntityType, KeyPress}
import seed.{BooleanSeed, IntSeed}

case class GameData(collisions: List[Collision]
                    , entitiesMap: Map[Int, Entity]
                    , keyPresses: List[KeyPress]
                    , modifiedEntitiesSet: Set[Int]
                    , idSeed: IntSeed
                    , booleanSeed: BooleanSeed):

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
            , seed: IntSeed
            , booleanSeed: BooleanSeed): GameData =
    GameData(List(), entitiesMap, List(), Set(), seed, booleanSeed)