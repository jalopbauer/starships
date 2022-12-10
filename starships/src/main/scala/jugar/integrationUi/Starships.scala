package jugar.integrationUi

import edu.austral.ingsis.starships.ui.*
import edu.austral.ingsis.starships.ui.ElementColliderType.*
import factory.RegularGameFlowFactory
import factory.gameDataFactory.RegularGameData
import javafx.application.Application
import javafx.application.Application.launch
import javafx.scene.Scene
import javafx.scene.input.KeyCode
import javafx.stage.Stage
import jugar.integrationUi.adapter.EntityAdapter
import jugar.integrationUi.listener.{CollisionListener, KeyPressListener, TimePassedListener}
import jugar.integrationUi.MutableGameState

class Starships() extends Application():
  private val imageResolver = CachedImageResolver(DefaultImageResolver())
  private val facade = ElementsViewFacade(imageResolver)
  private val keyTracker = KeyTracker()
  private val mutableGameData = MutableGameState(RegularGameData().create(), facade.getElements)
  private val gameFlow = RegularGameFlowFactory().create()

  override def stop(): Unit =
    facade.stop()
    keyTracker.stop()

  def start(primaryStage: Stage): Unit =
    mutableGameData.gameData.entities.map(EntityAdapter().meThem(_))

    facade.getTimeListenable.addEventListener(listener.TimePassedListener(mutableGameData, gameFlow))
    facade.getCollisionsListenable.addEventListener(listener.CollisionListener(mutableGameData))
    keyTracker.getKeyPressedListenable.addEventListener(listener.KeyPressListener(mutableGameData))

    val scene = Scene(facade.getView)
    keyTracker.setScene(scene)

    primaryStage.setScene(scene)
    primaryStage.setHeight(800.0)
    primaryStage.setWidth(800.0)

    facade.start()
    keyTracker.start()
    primaryStage.show()