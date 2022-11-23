package action.spawn

import action.Action
import entity.Entity
import entity.value.EntityType
import gameData.GameData
import spawner.Spawner

case class ShotSpawnAction() extends Action:
  def act(gameData: GameData): GameData =
    gameData.ships.foldLeft(gameData)((acc, ship) =>{
      val nextSeed = gameData.idSeed.next
      acc.add(ship.copy(id = nextSeed._1, entityType = EntityType.SHOT, health = 1, damage = 1)).copy(idSeed = nextSeed._2)
    })