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
import jugar.integrationUi.{CollisionListener, KeyPressListener, MutableGameData, TimePassedListener}

class Starships() extends Application():
  private val imageResolver = CachedImageResolver(DefaultImageResolver())
  private val facade = ElementsViewFacade(imageResolver)
  private val keyTracker = KeyTracker()
  private val mutableGameData = MutableGameData(RegularGameData().create(), facade.getElements)
  private val gameFlow = RegularGameFlowFactory().create()

  override def stop(): Unit =
    facade.stop()
    keyTracker.stop()

  def start(primaryStage: Stage): Unit =
    mutableGameData.gameData.entities.map(EntityAdapter().meThem(_))

    facade.getTimeListenable.addEventListener(TimePassedListener(mutableGameData, gameFlow))
    facade.getCollisionsListenable.addEventListener(CollisionListener(mutableGameData))
    keyTracker.getKeyPressedListenable.addEventListener(KeyPressListener(mutableGameData))

    val scene = Scene(facade.getView)
    keyTracker.setScene(scene)

    primaryStage.setScene(scene)
    primaryStage.setHeight(800.0)
    primaryStage.setHeight(800.0)

    facade.start()
    keyTracker.start()
    primaryStage.show()