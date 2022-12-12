package factory.actionSourceFactory

import action.spawn.*
import actionSource.ActionSource
import actionSource.movement.MovementActionSource
import actionSource.spawn.SpawnActionSource
import entity.value.motion.{Coordinate, Motion}

case class ShotSpawnActionSourceFactory() extends ActionSourceFactory:
  def create(): ActionSource =
    SpawnActionSource(List(
      ShotSpawnAction()
    ))

