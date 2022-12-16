package factory.actionsource

import actionSource.collision.{CollisionActionSource, AddPointsCollisionActionSourceConfig}
import factory.IdListSeed

case class CollisionPointsActionSourceFactory():
  def create: CollisionActionSource =
    CollisionActionSource(AddPointsCollisionActionSourceConfig())


