package actionSource.spawn

import action.spawn.{SpawnAction, SpawnAsteroidAction}
import actionSource.ActionSourceConfig
import entity.value.motion.{Coordinate, Motion, Rotation, Speed}

case class TimedSpawnAsteroidActionSourceConfig(time: Double, spawnActions: List[SpawnAction]) extends TimedSpawnActionSourceConfig