package factory.actionsource

import actionSource.collision.{CollisionActionSource, RegularCollisionActionSourceConfig}
import factory.IdListSeed

case class CollisionActionSourceFactory():
  def create: CollisionActionSource =
    CollisionActionSource(RegularCollisionActionSourceConfig())


