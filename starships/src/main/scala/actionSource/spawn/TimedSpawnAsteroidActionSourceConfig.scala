package actionSource.spawn

import action.spawn.{SpawnAction, SpawnAsteroidAction}
import actionSource.ActionSourceConfig
import entity.value.motion.{Coordinate, Motion, Rotation, Speed}

case class TimedSpawnAsteroidActionSourceConfig() extends TimedSpawnActionSourceConfig:
  def time: Double = 10
  def spawnActions: List[SpawnAction] =
    val zeroZero = Coordinate(0,0)
    val eightHundredZero = Coordinate(800,0)
    val zeroEightHundred = Coordinate(0,800)
    val eightHundredEightHundred = Coordinate(800,800)
    val noRotation = Rotation(0, 0)
    val speedOneOne = Speed(Coordinate(1, 1).normalize, 0, 0, 20)
    val speedThreeOne = Speed(Coordinate(3, 1).normalize, 0, 0, 20)
    val speedOneThree = Speed(Coordinate(1, 3).normalize, 0, 0, 20)

    List(
      SpawnAsteroidAction(Motion(zeroZero, noRotation, speedOneOne), 1, 5)
      , SpawnAsteroidAction(Motion(zeroZero, noRotation, speedThreeOne), 1, 5)
      , SpawnAsteroidAction(Motion(zeroZero, noRotation, speedOneThree), 2, 2)

      , SpawnAsteroidAction(Motion(eightHundredZero, noRotation, speedOneOne), 1, 5)
      , SpawnAsteroidAction(Motion(eightHundredZero, noRotation, speedThreeOne), 1, 5)
      , SpawnAsteroidAction(Motion(eightHundredZero, noRotation, speedOneThree), 2, 2)

      , SpawnAsteroidAction(Motion(zeroEightHundred, noRotation, speedOneOne), 1, 5)
      , SpawnAsteroidAction(Motion(zeroEightHundred, noRotation, speedThreeOne), 1, 5)
      , SpawnAsteroidAction(Motion(zeroEightHundred, noRotation, speedOneThree), 2, 2)

      , SpawnAsteroidAction(Motion(eightHundredEightHundred, noRotation, speedOneOne), 1, 5)
      , SpawnAsteroidAction(Motion(eightHundredEightHundred, noRotation, speedThreeOne), 1, 5)
      , SpawnAsteroidAction(Motion(eightHundredEightHundred, noRotation, speedOneThree), 2, 2)
    )