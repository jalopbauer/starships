package factory.actionsource

import actionSource.insideBorder.removeEntity.InsideBorderActionSourceRemoveEntity
import actionSource.insideBorder.{InsideBorderActionSource, InsideBorderAsteroidActionSourceConfig, InsideBorderShipActionSourceConfig, InsideBorderShotActionSourceConfig}
import actionSource.insideBorder.setEntity.InsideBorderActionSourceSetEntity
import config.ConfigFile
import entity.value.KeyPress
import factory.IdListSeed

case class InsideBorderSourceFactory():
  def create(): List[InsideBorderActionSource] =
    List( InsideBorderActionSourceSetEntity(InsideBorderShipActionSourceConfig(ConfigFile.border))
        , InsideBorderActionSourceRemoveEntity(InsideBorderAsteroidActionSourceConfig(ConfigFile.border))
        , InsideBorderActionSourceRemoveEntity(InsideBorderShotActionSourceConfig(ConfigFile.border))
    )


