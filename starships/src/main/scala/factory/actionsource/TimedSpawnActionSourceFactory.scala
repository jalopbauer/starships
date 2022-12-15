package factory.actionsource

import action.spawn.SpawnAsteroidAction
import actionSource.movement.{MoveActionSource, RegularMoveActionSourceConfig}
import actionSource.spawn.{TimedSpawnActionSource, TimedSpawnAsteroidActionSourceConfig}
import config.ConfigFile
import entity.value.motion.{Coordinate, Motion, Rotation, Speed}

case class TimedSpawnActionSourceFactory():
  def create: TimedSpawnActionSource =
    val value = ConfigFile.asteroidSpeed zip ConfigFile.asteroidHealth zip ConfigFile.asteroidDamage
    val newValue: List[(Speed, Int, Int)]= value.map(value =>
      val speed = value._1._1
      val health = value._1._2
      val damage = value._2
      (speed, health, damage)
    )
    val zeroZero = Coordinate(0,0)
    val eightHundredZero = Coordinate(800, 0)
    val zeroEightHundred = Coordinate(0, 800)
    val eightHundredEightHundred = Coordinate(800, 800)
    val noRotation = Rotation(0, 0)
    val zeroZeroSpawnAsteroidActionList = newValue.map(value => SpawnAsteroidAction(Motion(zeroZero, noRotation, value._1), value._3, value._2, ConfigFile.shipShape))
    val eightHundredZeroSpawnAsteroidActionList = newValue.map(value =>
        val speed = value._1
        val speedCoord = speed.speed
        val newSpeed = speed.copy(speed = speedCoord.copy(-speedCoord.x))
        SpawnAsteroidAction(Motion(eightHundredZero, noRotation, newSpeed), value._3, value._2, ConfigFile.shipShape)
      )
    val zeroEightHundredSpawnAsteroidActionList = newValue.map(value =>
        val speed = value._1
        val speedCoord = speed.speed
        val newSpeed = speed.copy(speed = speedCoord.copy(y = -speedCoord.y))
        SpawnAsteroidAction(Motion(zeroEightHundred, noRotation, newSpeed), value._3, value._2, ConfigFile.shipShape)
      )
    val eightHundredEightHundredSpawnAsteroidActionList = newValue.map(value =>
        val speed = value._1
        val speedCoord = speed.speed
        val newSpeed = speed.copy(speed = speedCoord.copy(-speedCoord.x, -speedCoord.y))
        SpawnAsteroidAction(Motion(eightHundredEightHundred, noRotation, newSpeed), value._3, value._2, ConfigFile.shipShape)
      )
    val spawnAsteroidActionList = zeroZeroSpawnAsteroidActionList
      .appendedAll(eightHundredZeroSpawnAsteroidActionList)
      .appendedAll(zeroEightHundredSpawnAsteroidActionList)
      .appendedAll(eightHundredEightHundredSpawnAsteroidActionList)
    TimedSpawnActionSource(TimedSpawnAsteroidActionSourceConfig(ConfigFile.timeBetweenAsteroidSwarm, spawnAsteroidActionList))


