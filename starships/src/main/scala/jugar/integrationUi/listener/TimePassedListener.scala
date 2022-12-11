package jugar.integrationUi.listener

import edu.austral.ingsis.starships.ui.{EventListener, TimePassed}
import gameFlow.GameFlow
import jugar.integrationUi.MutableGameState
import jugar.integrationUi.adapter.{EntityAdapter, IdAdapter}

case class TimePassedListener(mutableGameState: MutableGameState
                              , gameFlow: GameFlow)
  extends EventListener[TimePassed] :

  def handle(event: TimePassed): Unit =
    val gameData = mutableGameState.gameData

    val nextFrameGameData = gameFlow.nextFrame(gameData)
    mutableGameState.gameData = nextFrameGameData

    mutableGameState.update()

    mutableGameState.flush()
