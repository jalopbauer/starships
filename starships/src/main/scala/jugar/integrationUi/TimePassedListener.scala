package jugar.integrationUi

import edu.austral.ingsis.starships.ui.{EventListener, TimePassed}
import gameFlow.GameFlow

case class TimePassedListener(gameData: MutableGameData
                              , gameFlow: GameFlow) 
  extends EventListener[TimePassed]:
  def handle(event: TimePassed): Unit =
    val data = gameFlow.nextFrame(gameData.gameData)
    
    gameData.flush()
    
