package factory.gameDataFactory

import entity.Entity
import entity.value.motion.{Coordinate, Motion, Rotation, Speed}
import entity.value.EntityType
import gameState.PlayingGameState
import seed.{CrescendoIntSeed, PatternBooleanSeed}

case class RegularGameData() extends GameDataFactory:
  def create(): PlayingGameState =
    val seed = CrescendoIntSeed(3)
    val booleanSeed = PatternBooleanSeed(List(true, true, false, true, false))
    val motion = Motion(Coordinate(300,200), Rotation(0 , 10), Speed(Coordinate(0,0), 0.3, 0.1))
    val entitiesMap: Map[Int, Entity] = Map(
        1 -> Entity(1, EntityType.SHIP, motion, 10, 5)
      , 2 -> Entity(2, EntityType.SHIP, motion, 10, 5)
    )
    PlayingGameState(entitiesMap, seed, booleanSeed)

