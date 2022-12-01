package gameData

import action.Action
import entity.Entity
import entity.value.{Collision, EntityType, KeyPress}
import seed.{BooleanSeed, IntSeed}

case class PausedGameData(gameData: PlayingGameData) extends GameData:

  def entities: List[Entity] = List()

  def flush(): PausedGameData =
    this

  def ships:List[Entity] =
    List()

  def add(collision: Collision): PausedGameData =
    this
  def add(keyPress: KeyPress): PausedGameData =
    this
  def add(entity: Entity): PausedGameData =
    this