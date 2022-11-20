package jugar.integrationUi

import edu.austral.ingsis.starships.ui.{Collision, EventListener, KeyPressed}
import jugar.integrationUi.adapter.IdAdapter

case class KeyPressListener(gameData: MutableGameData) extends EventListener[KeyPressed]:
  val idAdapter: IdAdapter = IdAdapter()
  def handle(event: KeyPressed): Unit =
    val keys = List(event.getCurrentPressedKeys)
//    gameData.addKeyStrokes()
