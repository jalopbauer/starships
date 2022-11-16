package factory.actionSourceFactory

import actionSource.ActionSource
import actionSource.collision.CollisionActionSource
import gameData.EntityType

case class CollisionActionSourceFactory() extends ActionSourceFactory:
  def create(): ActionSource =
    CollisionActionSource(
      Map(
        (EntityType.SHIP, EntityType.ASTEROID) -> List()
      )
    )

