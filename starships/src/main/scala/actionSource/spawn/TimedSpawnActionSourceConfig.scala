package actionSource.spawn

import action.spawn.SpawnAction
import actionSource.ActionSourceConfig

trait TimedSpawnActionSourceConfig extends ActionSourceConfig[TimedSpawnActionSource]:
  def time: Double
  def spawnActions: List[SpawnAction]