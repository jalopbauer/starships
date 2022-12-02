package jugar.integrationUi.listener

import edu.austral.ingsis.starships.ui.{EventListener, KeyPressed}
import jugar.integrationUi.MutableGameState
import jugar.integrationUi.adapter.KeyPressAdapter

case class KeyPressListener(gameData: MutableGameState) extends EventListener[KeyPressed] :
  val keyPressAdapter: KeyPressAdapter = KeyPressAdapter()

  def handle(event: KeyPressed): Unit =
    gameData.addKeyStrokes(keyPressAdapter.themMe(event.getKey))
