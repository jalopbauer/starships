package factory

import factory.actionSourceFactory.{AsteroidSpawnActionSourceFactory, CollisionActionSourceFactory, MovementActionSourceFactory, ShotSpawnActionSourceFactory}
import gameFlow.GameFlow

case class RegularGameFlowFactory():
  val asteroidSpawnActionSourceFactory: AsteroidSpawnActionSourceFactory = AsteroidSpawnActionSourceFactory()
  val shotSpawnActionSourceFactory: ShotSpawnActionSourceFactory = ShotSpawnActionSourceFactory()
  val movementActionSourceFactory: MovementActionSourceFactory = MovementActionSourceFactory()
  val collisionActionSourceFactory: CollisionActionSourceFactory = CollisionActionSourceFactory()
  def create(): GameFlow =
    GameFlow(List(asteroidSpawnActionSourceFactory.create()
      , shotSpawnActionSourceFactory.create()
      , movementActionSourceFactory.create()
      , collisionActionSourceFactory.create()))
