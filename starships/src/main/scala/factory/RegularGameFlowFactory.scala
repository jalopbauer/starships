package factory

import actionSource.collision.{CollisionActionSource, RegularCollisionActionSourceConfig}
import actionSource.movement.{ControlledMovementActionSource, ForwardMovementActionSource, RegularControlledMovementActionSourceConfig, RegularForwardMovementActionSourceConfig}
import actionSource.spawn.{SpawnActionShotSourceConfig, SpawnActionSource, TimedSpawnActionSource, TimedSpawnAsteroidActionSourceConfig}
import gameFlow.GameFlow

case class RegularGameFlowFactory():
  def create(): GameFlow =
    GameFlow(List(
        CollisionActionSource(RegularCollisionActionSourceConfig())
      , ControlledMovementActionSource(RegularControlledMovementActionSourceConfig())
      , ForwardMovementActionSource(RegularForwardMovementActionSourceConfig())
      , SpawnActionSource(SpawnActionShotSourceConfig())
      , TimedSpawnActionSource(TimedSpawnAsteroidActionSourceConfig())
      ))
