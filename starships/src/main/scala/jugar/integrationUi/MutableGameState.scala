package jugar.integrationUi

import edu.austral.ingsis.starships.ui.ElementModel

import entity.Entity
import entity.value.{Collision, KeyPress}
import gameState.PlayingGameState

import scala.collection.mutable
import scala.collection.mutable.ListBuffer
import scala.collection.mutable.Map
import javafx.collections.ObservableMap


class MutableGameState(var gameData: PlayingGameState, var elements: ObservableMap[String, ElementModel]):
  
  def addCollision(collision: Collision): Unit =
    gameData = gameData.add(collision)

  def addKeyStrokes(keyPress: KeyPress): Unit =
    gameData = gameData.add(keyPress)

  def flush(): Unit =
    gameData = gameData.flush()
