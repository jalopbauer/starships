package jugar.integrationUi

import edu.austral.ingsis.starships.ui.{Collision, EventListener, KeyPressed}
import entity.value.KeyPress
import jugar.integrationUi.adapter.KeyPressAdapter

case class KeyPressListener(gameData: MutableGameData) extends EventListener[KeyPressed]:
  val keyPressAdapter: KeyPressAdapter = KeyPressAdapter()
  def handle(event: KeyPressed): Unit =
    gameData.addKeyStrokes(event.getKey)
