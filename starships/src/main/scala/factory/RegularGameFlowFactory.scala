package factory

import factory.actionSourceFactory.{CollisionActionSourceFactory, MovementActionSourceFactory, SpawnActionSourceFactory}
import gameFlow.GameFlow

case class RegularGameFlowFactory():
  val spawnActionSourceFactory: SpawnActionSourceFactory = SpawnActionSourceFactory()
  val movementActionSourceFactory: MovementActionSourceFactory = MovementActionSourceFactory()
  val collisionActionSourceFactory: CollisionActionSourceFactory = CollisionActionSourceFactory()
  def create(): GameFlow =
    GameFlow(List(spawnActionSourceFactory.create()
      , movementActionSourceFactory.create()
      , collisionActionSourceFactory.create()))
