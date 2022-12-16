package jugar.integrationUi.adapter

import edu.austral.ingsis.starships.ui.{ElementColliderType, ElementModel, ImageRef}
import entity.Entity
import entity.value.{EntityType, Shape}

case class EntityImgAdapter():

  def meThem(entityType: EntityType, shape: Shape): ImageRef =
    entityType match
      case EntityType.ASTEROID => ImageRef("Asteroid", shape.height, shape.width)
      case EntityType.SHIP => ImageRef("Starship", shape.height, shape.width)
      case EntityType.SHOT => ImageRef("Bullet", shape.height, shape.width)
