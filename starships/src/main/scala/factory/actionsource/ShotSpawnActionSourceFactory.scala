package factory.actionsource

import actionSource.spawn.{SpawnActionShotSourceConfig, SpawnActionSource}
import config.ConfigFile
import entity.value.KeyPress
import factory.IdListSeed

case class ShotSpawnActionSourceFactory():
  def create(idListSeed: IdListSeed): SpawnActionSource =
    val value = idListSeed.ids zip ConfigFile.shipsShootKey 
    SpawnActionSource(SpawnActionShotSourceConfig(value))


