package factory.gameDataFactory

import entity.Entity
import entity.value.motion.{Coordinate, Motion}
import entity.value.EntityType
import gameData.GameData
import spawner.Spawner

case class RegularGameData() extends GameDataFactory:
  def create(): GameData =
    val spawners= List()
    val motion = Motion(Coordinate(0,0), Coordinate(200,200), 0)
    val entitiesMap: Map[Int, Entity] = Map(
      1 -> Entity(1, EntityType.SHIP, motion, 10, 5)
      , 2 -> Entity(2, EntityType.SHIP, motion, 10, 5)
    )
    GameData(entitiesMap, spawners)

