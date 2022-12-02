package gameState

import action.Action
import entity.Entity
import entity.value.{Collision, EntityType, KeyPress}
import seed.{BooleanSeed, IntSeed}

case class PlayingGameState(collisions: List[Collision]
                            , entitiesMap: Map[Int, Entity]
                            , keyPresses: List[KeyPress]
                            , modifiedEntitiesSet: Set[Int]
                            , idSeed: IntSeed
                            , booleanSeed: BooleanSeed) extends GameState:

  def entities: List[Entity] = entitiesMap.values.toList

  def flush(): PlayingGameState =
    this.copy(collisions = List(), keyPresses = List(), modifiedEntitiesSet = Set())

  def ships:List[Entity] =
    entities.filter(_.entityType.equals(EntityType.SHIP))

  def add(collision: Collision): PlayingGameState =
    this.copy(collisions = collision :: collisions)

  def add(keyPress: KeyPress): PlayingGameState =
    this.copy(keyPresses = keyPress :: keyPresses)

  def add(entity: Entity): PlayingGameState =
    this.copy(entitiesMap = entitiesMap + (entity.id -> entity), modifiedEntitiesSet = modifiedEntitiesSet + entity.id)

object PlayingGameState:
  def apply(entitiesMap: Map[Int, Entity]
            , seed: IntSeed
            , booleanSeed: BooleanSeed): PlayingGameState =
    PlayingGameState(List(), entitiesMap, List(), Set(), seed, booleanSeed)