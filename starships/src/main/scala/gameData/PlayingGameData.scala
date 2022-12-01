package gameData

import action.Action
import entity.Entity
import entity.value.{Collision, EntityType, KeyPress}
import seed.{BooleanSeed, IntSeed}

case class PlayingGameData(collisions: List[Collision]
                           , entitiesMap: Map[Int, Entity]
                           , keyPresses: List[KeyPress]
                           , modifiedEntitiesSet: Set[Int]
                           , idSeed: IntSeed
                           , booleanSeed: BooleanSeed) extends GameData:

  def entities: List[Entity] = entitiesMap.values.toList

  def flush(): PlayingGameData =
    this.copy(collisions = List(), keyPresses = List(), modifiedEntitiesSet = Set())

  def ships:List[Entity] =
    entities.filter(_.entityType.equals(EntityType.SHIP))

  def add(collision: Collision): PlayingGameData =
    this.copy(collisions = collision :: collisions)

  def add(keyPress: KeyPress): PlayingGameData =
    this.copy(keyPresses = keyPress :: keyPresses)

  def add(entity: Entity): PlayingGameData =
    this.copy(entitiesMap = entitiesMap + (entity.id -> entity), modifiedEntitiesSet = modifiedEntitiesSet + entity.id)

object PlayingGameData:
  def apply(entitiesMap: Map[Int, Entity]
            , seed: IntSeed
            , booleanSeed: BooleanSeed): PlayingGameData =
    PlayingGameData(List(), entitiesMap, List(), Set(), seed, booleanSeed)