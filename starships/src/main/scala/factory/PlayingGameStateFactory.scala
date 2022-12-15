package factory
import config.ConfigFile
import entity.Entity
import entity.value.EntityType
import gameState.PlayingGameState
import seed.IntSeed

case class PlayingGameStateFactory():
  def create(idListSeed: IdListSeed): PlayingGameState =
    val idList = idListSeed.ids
    val idSeed = idListSeed.seed
    val shipValues = idList zip ConfigFile.playerShipsMotions zip ConfigFile.playerShipsDamage zip ConfigFile.playerShipsHealth
    val entitiesMap = shipValues.map(values => {
      val id = values._1._1._1
      val entityType = EntityType.SHIP
      val motion = values._1._1._2
      val damage = values._1._2
      val health = values._2
      id -> Entity(id, entityType, motion, damage, health, ConfigFile.shipShape)
    }).toMap
    PlayingGameState(entitiesMap, idSeed, ConfigFile.booleanSeed)
