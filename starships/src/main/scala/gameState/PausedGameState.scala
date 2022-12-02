package gameState

import action.Action
import entity.Entity
import entity.value.{Collision, EntityType, KeyPress}
import seed.{BooleanSeed, IntSeed}

case class PausedGameState(gameData: PlayingGameState) extends GameState:

  def entities: List[Entity] = List()

  def flush(): PausedGameState =
    this

  def ships:List[Entity] =
    List()

  def add(collision: Collision): PausedGameState =
    this
  def add(keyPress: KeyPress): PausedGameState =
    this
  def add(entity: Entity): PausedGameState =
    this