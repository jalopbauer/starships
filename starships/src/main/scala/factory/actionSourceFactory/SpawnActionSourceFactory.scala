package factory.actionSourceFactory

import action.spawn.*
import actionSource.ActionSource
import actionSource.movement.MovementActionSource
import actionSource.spawn.SpawnActionSource
import entity.value.motion.{Coordinate, Motion}
case class SpawnActionSourceFactory() extends ActionSourceFactory:
  def create(): ActionSource =
    SpawnActionSource(List(
      ShotSpawnAction(),
      SpawnAsteroidAction(Motion(Coordinate(1,2),Coordinate(0,0),0), 1, 5)
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

