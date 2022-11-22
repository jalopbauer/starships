package jugar.integrationUi

import entity.Entity
import entity.value.{Collision, KeyPress}
import gameData.GameData
import spawner.Spawner

import scala.collection.mutable
import scala.collection.mutable.ListBuffer
import scala.collection.mutable.Map

class MutableGameData(var gameData: GameData):

  def addCollision(collision: Collision): Unit =
    gameData = gameData.copy(collisions =  collision :: gameData.collisions)

  def addKeyStrokes(keyPress: KeyPress): Unit =
    gameData = gameData.copy(keyPresses =  keyPress :: gameData.keyPresses)

  def flush(): Unit =
    gameData.copy(collisions = List(), keyPresses = List())

  def setGameData(gameData: GameData): Unit =
    this.gameData = gameData

