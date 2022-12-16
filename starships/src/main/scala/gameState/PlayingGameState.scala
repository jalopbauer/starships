package gameState

import action.Action
import entity.Entity
import entity.value.{Collision, EntityType, KeyPress}
import seed.{BooleanSeed, IntSeed}

case class PlayingGameState(  entitiesMap: Map[Int, Entity]
                            , idSeed: IntSeed
                            , booleanSeed: BooleanSeed
                            , isPaused: Boolean = false
                            , keyPresses: List[KeyPress] = List()
                            , modifiedEntitiesSet: Set[Int] = Set()
                            , collisions: List[Collision] = List()
                            , previousSpawnTime: Double = 0
                            , currentTime: Double = 0
                            , secondsSinceLastTime: Double = 0
                            , deadEntitiesSet: Set[Int] = Set()) extends GameState:

  def entities: List[Entity] = entitiesMap.values.toList

  def flush(): PlayingGameState =
    this.copy(collisions = List(), keyPresses = List(), modifiedEntitiesSet = Set())

  def ships:List[Entity] =
    entities.filter(_.entityType.equals(EntityType.SHIP))

  def add(collision: Collision): PlayingGameState =
    this.copy(collisions = collision :: collisions)

  def add(keyPress: KeyPress): PlayingGameState =
    if (keyPress.equals(KeyPress("p"))) this.copy(isPaused = !isPaused)
    else this.copy(keyPresses = keyPress :: keyPresses)

  def add(entity: Entity): PlayingGameState =
    this.copy(entitiesMap = entitiesMap + (entity.id -> entity), modifiedEntitiesSet = modifiedEntitiesSet + entity.id)

  def killEntity(entity: Entity): PlayingGameState =
    this.copy(deadEntitiesSet = deadEntitiesSet + entity.id)

  def removeDeadEntities: PlayingGameState =
    this.copy(entitiesMap = entitiesMap.removedAll(deadEntitiesSet))
    
  def contains(keyPress: KeyPress): Boolean =
    keyPresses.contains(keyPress)
    
  def entity(entityId: Int): Option[Entity] =
    entitiesMap.get(entityId)