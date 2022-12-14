package actionSource.spawn

import action.spawn.{ShotSpawnAction, SpawnAction}

case class ShotTimedSpawnActionSourceConfig() extends TimedSpawnActionSourceConfig:
  def time: Double = 2.5
  def spawnActions: List[SpawnAction] =
    List(ShotSpawnAction())