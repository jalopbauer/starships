package jugar.integrationUi.listener

import edu.austral.ingsis.starships.ui.{EventListener, KeyPressed}
import jugar.integrationUi.MutableGameState
import jugar.integrationUi.adapter.KeyPressAdapter

import scala.jdk.javaapi.CollectionConverters.asScala
case class KeyPressListener(gameData: MutableGameState) extends EventListener[KeyPressed] :
  val keyPressAdapter: KeyPressAdapter = KeyPressAdapter()

  def handle(event: KeyPressed): Unit =
    asScala(event.getCurrentPressedKeys).foreach(keyPress => gameData.addKeyStrokes(keyPressAdapter.themMe(keyPress)))
