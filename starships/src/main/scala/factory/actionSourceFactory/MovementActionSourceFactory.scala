//package factory.actionSourceFactory
//
//import action.movement.{ShipBreakMovementActionBuilder, ShipForwardMovementActionBuilder}
//import action.movement.buildingBlocks.{ConstantMovementActionBuilder, MaxValueVariableMovementActionBuilder, SpeedReductionMovementActionBuilder, VariableMovementActionBuilder}
//import actionSource.ActionSource
//import actionSource.MovementActionSource
//import entity.value.{EntityType, KeyPress}
//
//case class MovementActionSourceFactory() extends ActionSourceFactory:
//  def create(): ActionSource =
//    val constantMovementActionBuilder = ConstantMovementActionBuilder()
//    val variableMovementAction = VariableMovementActionBuilder(
//      1.1
//    )
//    val maxValueVariableMovementAction = MaxValueVariableMovementActionBuilder(
//      20
//      , variableMovementAction
//      , constantMovementActionBuilder
//    )
//    val slowDownMovementAction = SpeedReductionMovementActionBuilder(
//      1.5
//    )
//    val shipForwardMovementActionBuilder = ShipForwardMovementActionBuilder(
//      KeyPress("w")
//      , maxValueVariableMovementAction
//      , slowDownMovementAction
//    )
//    val shipBreakSlowDownMovementAction = SpeedReductionMovementActionBuilder(
//      2
//    )
//    val shipBreakMovementAction = ShipBreakMovementActionBuilder(
//      KeyPress("s")
//      , shipBreakSlowDownMovementAction
//    )
