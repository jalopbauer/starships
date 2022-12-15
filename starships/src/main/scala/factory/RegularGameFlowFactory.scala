package factory

import actionSource.{PositionSource, PositionSourceConfig}
import actionSource.collision.{CollisionActionSource, RegularCollisionActionSourceConfig}
import actionSource.movement.{ControlledMovementActionSource, MoveActionSource, RegularControlledMovementActionSourceConfig, RegularMoveActionSourceConfig}
import actionSource.spawn.{SpawnActionShotSourceConfig, SpawnActionSource, TimedSpawnActionSource, TimedSpawnAsteroidActionSourceConfig}
import gameFlow.GameFlow

case class RegularGameFlowFactory():
  def create(): GameFlow =
    GameFlow(List(
        CollisionActionSource(RegularCollisionActionSourceConfig())
      , ControlledMovementActionSource(RegularControlledMovementActionSourceConfig())
      , MoveActionSource(RegularMoveActionSourceConfig())
      , SpawnActionSource(SpawnActionShotSourceConfig())
      , TimedSpawnActionSource(TimedSpawnAsteroidActionSourceConfig())
      , PositionSource(PositionSourceConfig())
      ))
