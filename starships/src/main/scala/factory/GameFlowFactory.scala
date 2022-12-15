package factory

import actionSource.collision.{CollisionActionSource, RegularCollisionActionSourceConfig}
import actionSource.insideBorder.removeEntity.InsideBorderActionSourceRemoveEntity
import actionSource.insideBorder.{InsideBorderAsteroidActionSourceConfig, InsideBorderShipActionSourceConfig, InsideBorderShotActionSourceConfig, setEntity}
import actionSource.insideBorder.setEntity.InsideBorderActionSourceSetEntity
import actionSource.movement.{ControlledMovementActionSource, InputControlledMovementActionSourceConfig, MoveActionSource, RegularMoveActionSourceConfig}
import actionSource.spawn.{SpawnActionShotSourceConfig, SpawnActionSource, TimedSpawnActionSource, TimedSpawnAsteroidActionSourceConfig}
import factory.actionSourceConfigFactory.ControlledMovementActionSourceConfigFactory
import factory.actionsource.ControlledMovementActionSourceFactory
import gameFlow.GameFlow
import seed.IntSeed

case class GameFlowFactory():
  val controlledMovementActionSourceFactory: ControlledMovementActionSourceFactory = ControlledMovementActionSourceFactory()
  def create(idListSeed: IdListSeed): GameFlow = {
    GameFlow(
      List(
        CollisionActionSource(RegularCollisionActionSourceConfig())
        , controlledMovementActionSourceFactory.create(idListSeed)
      ))
  }


//      , MoveActionSource(RegularMoveActionSourceConfig())
//      , SpawnActionSource(SpawnActionShotSourceConfig())
//      , TimedSpawnActionSource(TimedSpawnAsteroidActionSourceConfig())
//      , InsideBorderActionSourceSetEntity(InsideBorderShipActionSourceConfig())
//      , InsideBorderActionSourceRemoveEntity(InsideBorderAsteroidActionSourceConfig())
//      , InsideBorderActionSourceRemoveEntity(InsideBorderShotActionSourceConfig())