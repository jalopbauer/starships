package gameData

import action.Action
import entity.Entity
import entity.value.{Collision, EntityType, KeyPress}
import seed.{BooleanSeed, IntSeed}

trait GameData:

  def entities: List[Entity]

  def flush(): GameData

  def ships:List[Entity]

  def add(collision: Collision): GameData
  def add(keyPress: KeyPress): GameData
  def add(entity: Entity): GameData