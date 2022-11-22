//import edu.austral.ingsis.starships.ui.*
//import edu.austral.ingsis.starships.ui.ElementColliderType.*
//import javafx.application.Application
//import javafx.application.Application.launch
//import javafx.scene.Scene
//import javafx.scene.input.KeyCode
//import javafx.stage.Stage
//import jugar.integrationUi.{CollisionListener, TimePassedListener, KeyPressListener}
//
//class Starships extends Application():
//  private val imageResolver = CachedImageResolver(DefaultImageResolver())
//  private val facade = ElementsViewFacade(imageResolver)
//  private val keyTracker = KeyTracker()
//
//  def start(primaryStage: Stage): Unit =
////    facade.getTimeListenable.addEventListener(TimePassedListener())
////    facade.getCollisionsListenable.addEventListener(CollisionListener())
////    keyTracker.getKeyPressedListenable.addEventListener(KeyPressedListener())
//
//    val scene = Scene(facade.getView)
//    keyTracker.setScene(scene)
//
//    primaryStage.setScene(scene)
//    primaryStage.setHeight(800.0)
//    primaryStage.setHeight(800.0)
//
//    facade.start()
//    keyTracker.start()
//    primaryStage.show()
//
//  def stop(): Unit
//    facade.stop()
//    keyTracker.stop()