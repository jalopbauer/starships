package jugar.integrationUi.listener

import edu.austral.ingsis.starships.ui.{EventListener, TimePassed}
import gameFlow.GameFlow
import jugar.integrationUi.MutableGameState
import jugar.integrationUi.adapter.{EntityAdapter, IdAdapter}

case class TimePassedListener(gameData: MutableGameState
                              , gameFlow: GameFlow)
  extends EventListener[TimePassed] :
  val idAdapter: IdAdapter = IdAdapter()
  val entityAdapter: EntityAdapter = EntityAdapter()

  def handle(event: TimePassed): Unit =
    val data = gameFlow.nextFrame(gameData.gameData)
    data.modifiedEntitiesSet.foreach(entityId => {
      val optionalEntity = data.entitiesMap.get(entityId)
      if (optionalEntity.isDefined)
        val entityModel = entityAdapter.meThem(optionalEntity.get)
        val id = entityModel.getId
        gameData.elements.put(id, entityModel)
    })
    gameData.flush()
