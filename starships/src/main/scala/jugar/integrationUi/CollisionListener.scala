package jugar.integrationUi

import edu.austral.ingsis.starships.ui.{Collision, EventListener}
import jugar.integrationUi.adapter.IdAdapter

case class CollisionListener(gameData: MutableGameData) extends EventListener[Collision]:
  val idAdapter: IdAdapter = IdAdapter()
  def handle(event: Collision): Unit =
    val entities = gameData.gameData.entitiesMap
    val component1 = entities(idAdapter.themMe(event.component1()))
    val component2 = entities(idAdapter.themMe(event.component2()))
    gameData.addCollision(entity.value.Collision(component1, component2))
