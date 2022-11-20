package jugar.integrationUi

import edu.austral.ingsis.starships.ui.{Collision, EventListener, KeyPressed}
import entity.value.KeyPress
import jugar.integrationUi.adapter.IdAdapter

case class KeyPressListener(gameData: MutableGameData) extends EventListener[KeyPressed]:
  val idAdapter: IdAdapter = IdAdapter()
  def handle(event: KeyPressed): Unit =
    gameData.addKeyStrokes(KeyPress(event.getKey.getChar))
