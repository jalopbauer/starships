package factory

import actionSource.collision.{CollisionActionSource, RegularCollisionActionSourceConfig}
import actionSource.insideBorder.removeEntity.InsideBorderActionSourceRemoveEntity
import actionSource.insideBorder.{InsideBorderAsteroidActionSourceConfig, InsideBorderShipActionSourceConfig, InsideBorderShotActionSourceConfig, setEntity}
import actionSource.insideBorder.setEntity.InsideBorderActionSourceSetEntity
import actionSource.movement.{ControlledMovementActionSource, MoveActionSource, RegularControlledMovementActionSourceConfig, RegularMoveActionSourceConfig}
import actionSource.spawn.{SpawnActionShotSourceConfig, SpawnActionSource, TimedSpawnActionSource, TimedSpawnAsteroidActionSourceConfig}
import gameFlow.GameFlow
import seed.IntSeed

case class GameFlowFactory():
  def create(idListSeed: (List[Int], IntSeed)): GameFlow =
    GameFlow(List(
        CollisionActionSource(RegularCollisionActionSourceConfig())
      , ControlledMovementActionSource(RegularControlledMovementActionSourceConfig())
      , MoveActionSource(RegularMoveActionSourceConfig())
      , SpawnActionSource(SpawnActionShotSourceConfig())
      , TimedSpawnActionSource(TimedSpawnAsteroidActionSourceConfig())
      , InsideBorderActionSourceSetEntity(InsideBorderShipActionSourceConfig())
      , InsideBorderActionSourceRemoveEntity(InsideBorderAsteroidActionSourceConfig())
      , InsideBorderActionSourceRemoveEntity(InsideBorderShotActionSourceConfig())
      ))
