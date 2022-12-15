//package factory
//
//import actionSource.collision.{CollisionActionSource, RegularCollisionActionSourceConfig}
//import actionSource.insideBorder.removeEntity.InsideBorderActionSourceRemoveEntity
//import actionSource.insideBorder.{InsideBorderAsteroidActionSourceConfig, InsideBorderShipActionSourceConfig, InsideBorderShotActionSourceConfig, setEntity}
//import actionSource.insideBorder.setEntity.InsideBorderActionSourceSetEntity
//import actionSource.movement.{ControlledMovementActionSource, MoveActionSource, RegularControlledMovementActionSourceConfig, RegularMoveActionSourceConfig}
//import actionSource.spawn.{SpawnActionShotSourceConfig, SpawnActionSource, TimedSpawnActionSource, TimedSpawnAsteroidActionSourceConfig}
//import gameFlow.GameFlow
//
//case class RegularGameFlowFactory():
//  def create(): GameFlow =
//    GameFlow(List(
//        CollisionActionSource(RegularCollisionActionSourceConfig())
//      , ControlledMovementActionSource(RegularControlledMovementActionSourceConfig())
//      , MoveActionSource(RegularMoveActionSourceConfig())
//      , SpawnActionSource(SpawnActionShotSourceConfig())
//      , TimedSpawnActionSource(TimedSpawnAsteroidActionSourceConfig())
//      , InsideBorderActionSourceSetEntity(InsideBorderShipActionSourceConfig())
//      , InsideBorderActionSourceRemoveEntity(InsideBorderAsteroidActionSourceConfig())
//      , InsideBorderActionSourceRemoveEntity(InsideBorderShotActionSourceConfig())
//      ))
