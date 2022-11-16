package factory.actionSourceFactory

import action.collision.damageAction.CollisionDamageActionBuilder
import actionSource.ActionSource
import actionSource.collision.CollisionActionSource
import gameData.EntityType

case class CollisionActionSourceFactory() extends ActionSourceFactory:
  def create(): ActionSource =
    CollisionActionSource(
      Map(
        (EntityType.SHIP, EntityType.ASTEROID) -> (List(CollisionDamageActionBuilder()), List(CollisionDamageActionBuilder()))
        , (EntityType.SHIP, EntityType.SHOT) -> (List(CollisionDamageActionBuilder()), List(CollisionDamageActionBuilder()))
        , (EntityType.ASTEROID, EntityType.SHOT) -> (List(CollisionDamageActionBuilder()), List(CollisionDamageActionBuilder())))
    )

