package actionSource.spawn

import action.spawn.{ShotSpawnAction, SpawnAction}
import actionSource.ActionSourceConfig
import entity.value.KeyPress


case class SpawnActionShotSourceConfig(entityShootKeys: List[(Int, KeyPress)]) extends SpawnActionSourceConfig