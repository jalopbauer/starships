package actionSource.spawn

import action.spawn.SpawnAction
import actionSource.ActionSourceConfig
import entity.value.KeyPress

trait SpawnActionSourceConfig extends ActionSourceConfig[SpawnActionSource]:
  def entityShootKeys: List[(Int, KeyPress)]