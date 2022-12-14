package actionSource.spawn

import action.spawn.SpawnAction
import actionSource.ActionSourceConfig

trait SpawnActionSourceConfig extends ActionSourceConfig[SpawnActionSource]:
  def spawnActions: List[SpawnAction]