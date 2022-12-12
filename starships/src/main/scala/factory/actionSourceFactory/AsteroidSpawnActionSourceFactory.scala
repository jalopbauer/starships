package factory.actionSourceFactory

import action.spawn.*
import actionSource.ActionSource
import actionSource.movement.MovementActionSource
import actionSource.spawn.TimedSpawnActionSource
import entity.value.motion.{Coordinate, Motion}
case class AsteroidSpawnActionSourceFactory() extends ActionSourceFactory:
  def create(): ActionSource =
    TimedSpawnActionSource(10,
      List(
//        SpawnAsteroidAction(Motion(Coordinate(0,0),0, 5), 1, 5)
//      , SpawnAsteroidAction(Motion(Coordinate(0,0),0 , 5), 1, 5)
//      , SpawnAsteroidAction(Motion(Coordinate(0,0),0, 5), 2, 2)
//      , SpawnAsteroidAction(Motion(Coordinate(0,0),0, 5), 1, 2)
//
//      , SpawnAsteroidAction(Motion(Coordinate(800, 800), 0, 5), 1, 5)
//      , SpawnAsteroidAction(Motion(Coordinate(800, 800), 0, 5), 1, 5)
//      , SpawnAsteroidAction(Motion(Coordinate(800, 800), 0, 5), 2, 2)
//      , SpawnAsteroidAction(Motion(Coordinate(800, 800), 0, 5), 1, 2)
//
//      , SpawnAsteroidAction(Motion(Coordinate(0, 800), 0, 5), 1, 5)
//      , SpawnAsteroidAction(Motion(Coordinate(0, 800), 0, 5), 1, 5)
//      , SpawnAsteroidAction(Motion(Coordinate(0, 800), 0, 5), 2, 2)
//      , SpawnAsteroidAction(Motion(Coordinate(0, 800), 0, 5), 1, 2)
//
//      , SpawnAsteroidAction(Motion(Coordinate(800, 0), 0, 5), 1, 5)
//      , SpawnAsteroidAction(Motion(Coordinate(800, 0), 0, 5), 1, 5)
//      , SpawnAsteroidAction(Motion(Coordinate(800, 0), 0, 5), 2, 2)
//      , SpawnAsteroidAction(Motion(Coordinate(800, 0), 0, 5), 1, 2)
    ))

