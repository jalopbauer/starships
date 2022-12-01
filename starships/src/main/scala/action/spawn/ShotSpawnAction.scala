package action.spawn

import action.spawn.SpawnAction
import entity.Entity
import entity.value.EntityType
import gameData.PlayingGameData

case class ShotSpawnAction() extends SpawnAction:
  def act(gameData: PlayingGameData): PlayingGameData =
    gameData.ships.foldLeft(gameData)((acc, ship) =>{
      val nextSeed = gameData.idSeed.next
      acc.add(ship.copy(id = nextSeed._1, entityType = EntityType.SHOT, health = 1, damage = 1)).copy(idSeed = nextSeed._2)
    })