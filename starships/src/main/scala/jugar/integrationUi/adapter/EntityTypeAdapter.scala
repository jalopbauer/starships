package jugar.integrationUi.adapter

import edu.austral.ingsis.starships.ui.{ElementColliderType, ElementModel}
import entity.Entity
import entity.value.EntityType

case class EntityTypeAdapter():

  def meThem(entityType: EntityType): ElementColliderType =
    entityType match
      case EntityType.ASTEROID => ElementColliderType.Elliptical
      case EntityType.SHIP => ElementColliderType.Triangular
      case EntityType.SHOT => ElementColliderType.Rectangular
