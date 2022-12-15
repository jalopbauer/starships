package jugar.integrationUi

import edu.austral.ingsis.starships.ui.*
import edu.austral.ingsis.starships.ui.ElementColliderType.*
import factory.{GameFactory, RegularGameFactory}
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
  private val game = RegularGameFactory().create
  private val mutableGameData = MutableGameState(game.gameState, facade.getElements)
  private val gameFlow = game.gameFlow

  override def stop(): Unit =
    facade.stop()
    keyTracker.stop()

  def start(primaryStage: Stage): Unit =
    val initialEntities = mutableGameData.gameData.entities.map(EntityAdapter().meThem(_))
    initialEntities.foreach(entityModel =>
      mutableGameData.elements.put(entityModel.getId, entityModel)
    )

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