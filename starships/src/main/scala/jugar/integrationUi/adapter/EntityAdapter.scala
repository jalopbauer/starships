//package jugar.integrationUi.adapter
//
//import edu.austral.ingsis.starships.ui.ElementModel
//import entity.Entity
//import entity.value.EntityType
//
//case class EntityAdapter(sizes: Map[EntityType, (Int, Int)]):
//
//  val idAdapter: IdAdapter = IdAdapter()
//  def meThem(entity: Entity): ElementModel = {
//    val motion = entity.motion
//    val position = motion.position
//    val size = sizes(entity.entityType)
//    ElementModel(idAdapter.meThem(entity.id)
//      , position.x
//      , position.y
//      , size._1
//      , size._2
//      , motion.degree
//      , 
//    )
//  }
//  def themMe(id: String): Int =
//    id.toInt