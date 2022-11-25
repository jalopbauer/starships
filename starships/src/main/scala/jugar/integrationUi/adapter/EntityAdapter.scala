package jugar.integrationUi.adapter

import edu.austral.ingsis.starships.ui.ElementModel
import entity.Entity

case class EntityAdapter():
  val entityTypeAdapter: EntityTypeAdapter = EntityTypeAdapter()
  val idAdapter: IdAdapter = IdAdapter()
  def meThem(entity: Entity): ElementModel =
//    ElementModel("asteroid-1", 0.0, 0.0, 30.0, 40.0, 0.0, Elliptical, null)
    ElementModel(
      idAdapter.meThem(entity.id)
      , entity.motion.position.x
      , entity.motion.position.y
      , 30.0
      , 30.0
      , entity.motion.degree
      , entityTypeAdapter.meThem(entity.entityType)
      , null
    )