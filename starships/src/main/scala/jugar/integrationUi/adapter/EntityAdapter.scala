package jugar.integrationUi.adapter

import edu.austral.ingsis.starships.ui.ElementModel
import entity.Entity

case class EntityAdapter():
  val entityTypeAdapter: EntityTypeAdapter = EntityTypeAdapter()
  val idAdapter: IdAdapter = IdAdapter()
  def meThem(entity: Entity): ElementModel =
    ElementModel(
      idAdapter.meThem(entity.id)
      , entity.motion.position.x
      , entity.motion.position.y
      , entity.shape.height
      , entity.shape.height
      , entity.motion.rotation.angleInDegrees
      , entityTypeAdapter.meThem(entity.entityType)
      , null
    )