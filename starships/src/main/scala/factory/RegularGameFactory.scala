package factory

import config.ConfigFile
import entity.Entity
import entity.value.EntityType
import entity.value.motion.Motion
import game.Game
import gameState.PlayingGameState
import seed.IntSeed


case class RegularGameFactory() extends GameFactory:
  def create: Game =
    val amountOfEntities = 1 to ConfigFile.amountOfPlayers
    type IdListSeed = (List[Int], IntSeed)
    val idListSeed = amountOfEntities.foldLeft((List(), ConfigFile.idSeed):IdListSeed)((acc, _) =>
      val ids = acc._1
      val seed = acc._2
      val next = seed.next
      (ids.appended(next._1), next._2)
    )
    val idList = idListSeed._1
    val idSeed = idListSeed._2
    val shipValues = idList zip ConfigFile.playerShipsMotions zip ConfigFile.playerShipsDamage zip ConfigFile.playerShipsHealth
    val entitiesMap = shipValues.map(values => {
      val id = values._1._1._1
      val entityType = EntityType.SHIP
      val motion = values._1._1._2
      val damage = values._1._2
      val health = values._2
      id -> Entity(id, entityType, motion, damage, health)
    }).toMap
    val gameState = PlayingGameState(entitiesMap, idSeed, ConfigFile.booleanSeed)

    Game(gameState, null)
