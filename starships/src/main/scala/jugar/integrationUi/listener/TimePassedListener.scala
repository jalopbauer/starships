package jugar.integrationUi.listener

import edu.austral.ingsis.starships.ui.{EventListener, TimePassed}
import gameFlow.GameFlow
import jugar.integrationUi.MutableGameState
import jugar.integrationUi.adapter.{EntityAdapter, IdAdapter}

case class TimePassedListener(mutableGameStateameData: MutableGameState
                              , gameFlow: GameFlow)
  extends EventListener[TimePassed] :
  val idAdapter: IdAdapter = IdAdapter()
  val entityAdapter: EntityAdapter = EntityAdapter()

  def handle(event: TimePassed): Unit =
    val gameData = mutableGameStateameData.gameData

    val nextFrameGameData = gameFlow.nextFrame(gameData)
    mutableGameStateameData.gameData = nextFrameGameData

    mutableGameStateameData.update()

    mutableGameStateameData.flush()
