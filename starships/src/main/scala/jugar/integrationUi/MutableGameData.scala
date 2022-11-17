package jugar.integrationUi

import entity.Entity
import entity.value.{Collision, KeyStroke}
import gameData.implementation.DefaultGameData
import spawner.Spawner

import scala.collection.mutable
import scala.collection.mutable.ListBuffer
import scala.collection.mutable.Map

class MutableGameData(var gameData: DefaultGameData):

  def addCollision(collision: Collision): Unit =
    gameData = gameData.copy(collisions =  collision :: gameData.collisions)

  def addKeyStroke(keyStroke: KeyStroke): Unit =
    gameData = gameData.copy(keyStrokes =  keyStroke :: gameData.keyStrokes)

  def flush(): Unit =
    gameData.copy(collisions = List(), keyStrokes = List())

