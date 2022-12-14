package actionSource.spawn

import action.spawn.{ShotSpawnAction, SpawnAction}
import actionSource.ActionSourceConfig

case class SpawnActionShotSourceConfig() extends SpawnActionSourceConfig:
  def spawnActions: List[SpawnAction] =
    List(ShotSpawnAction())