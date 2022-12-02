package gameState

import action.Action
import entity.Entity
import entity.value.{Collision, EntityType, KeyPress}
import seed.{BooleanSeed, IntSeed}

trait GameState:

  def entities: List[Entity]

  def flush(): GameState

  def ships:List[Entity]

  def add(collision: Collision): GameState
  def add(keyPress: KeyPress): GameState
  def add(entity: Entity): GameState