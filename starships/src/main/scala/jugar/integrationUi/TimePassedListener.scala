package jugar.integrationUi

import edu.austral.ingsis.starships.ui.{EventListener, TimePassed}
import gameFlow.GameFlow
import jugar.integrationUi.adapter.IdAdapter

case class TimePassedListener(gameData: MutableGameData
                              , gameFlow: GameFlow)
  extends EventListener[TimePassed]:
  val idAdapter: IdAdapter = IdAdapter()

  def handle(event: TimePassed): Unit =
        val data = gameFlow.nextFrame(gameData.gameData)
        data.modifiedEntitiesSet.foreach(entityId => {
          val entity = data.entities(entityId)
          val motion = entity.motion
          val position = motion.position
          val model = gameData.elements.get(idAdapter.meThem(entity.id))
          model.getX.setValue(position.x.toDouble)
          model.getY.setValue(position.y.toDouble)
          model.getRotationInDegrees.setValue(motion.degree)
        })
        gameData.flush()

