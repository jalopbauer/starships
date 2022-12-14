package jugar.integrationUi.listener

import edu.austral.ingsis.starships.ui.{Collision, EventListener}
import jugar.integrationUi.MutableGameState
import jugar.integrationUi.adapter.IdAdapter

case class CollisionListener(gameData: MutableGameState) extends EventListener[Collision] :
  val idAdapter: IdAdapter = IdAdapter()

  def handle(event: Collision): Unit =
    val entitiesMap = gameData.gameData.entitiesMap
    val component1 = entitiesMap.get(idAdapter.themMe(event.component1()))
    val component2 = entitiesMap.get(idAdapter.themMe(event.component2()))
    if (component1.isDefined && component2.isDefined) gameData.addCollision(entity.value.Collision(component1.get, component2.get))
