package factory.actionSourceFactory

import action.spawn.*
import actionSource.ActionSource
import actionSource.movement.MovementActionSource
import actionSource.spawn.TimedSpawnActionSource
import entity.value.motion.{Coordinate, Motion}
case class AsteroidSpawnActionSourceFactory() extends ActionSourceFactory:
  def create(): ActionSource =
    TimedSpawnActionSource(10, List(SpawnAsteroidAction(Motion(Coordinate(1,2),Coordinate(0,0),0), 1, 5)
      , SpawnAsteroidAction(Motion(Coordinate(2,1),Coordinate(0,0),0), 1, 5)
      , SpawnAsteroidAction(Motion(Coordinate(3,2),Coordinate(0,0),0), 2, 2)
      , SpawnAsteroidAction(Motion(Coordinate(2,3),Coordinate(0,0),0), 1, 2)

      , SpawnAsteroidAction(Motion(Coordinate(-1, -2), Coordinate(800, 800), 0), 1, 5)
      , SpawnAsteroidAction(Motion(Coordinate(-2, -1), Coordinate(800, 800), 0), 1, 5)
      , SpawnAsteroidAction(Motion(Coordinate(-3, -2), Coordinate(800, 800), 0), 2, 2)
      , SpawnAsteroidAction(Motion(Coordinate(-2, -3), Coordinate(800, 800), 0), 1, 2)

      , SpawnAsteroidAction(Motion(Coordinate(1, -2), Coordinate(0, 800), 0), 1, 5)
      , SpawnAsteroidAction(Motion(Coordinate(2, -1), Coordinate(0, 800), 0), 1, 5)
      , SpawnAsteroidAction(Motion(Coordinate(3, -2), Coordinate(0, 800), 0), 2, 2)
      , SpawnAsteroidAction(Motion(Coordinate(2, -3), Coordinate(0, 800), 0), 1, 2)

      , SpawnAsteroidAction(Motion(Coordinate(-1, 2), Coordinate(800, 0), 0), 1, 5)
      , SpawnAsteroidAction(Motion(Coordinate(-2, 1), Coordinate(800, 0), 0), 1, 5)
      , SpawnAsteroidAction(Motion(Coordinate(-3, 2), Coordinate(800, 0), 0), 2, 2)
      , SpawnAsteroidAction(Motion(Coordinate(-2, 3), Coordinate(800, 0), 0), 1, 2)
    ))

