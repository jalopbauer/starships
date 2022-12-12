//package factory.actionSourceFactory
//
//import action.movement.ShipForwardMovementAction
//import action.movement.buildingBlocks.{ConstantMovementActionBuilder, MaxValueVariableMovementActionBuilder}
//import actionSource.ActionSource
//import actionSource.movement.MovementActionSource
//import entity.value.{EntityType, KeyPress}
//
//case class MovementActionSourceFactory() extends ActionSourceFactory:
//  def create(): ActionSource = {
//    val maxValueVariableMovementAction = MaxValueVariableMovementActionBuilder()
//    val forward = ShipForwardMovementMovementActionBuilder(maxValueVariableMovementAction,)
//    MovementActionSource(
//      Map(
//        EntityType.ASTEROID -> List(constantMovementActionBuilder)
//        , EntityType.SHOT -> List(constantMovementActionBuilder)
//        , EntityType.SHIP -> List(constantMovementActionBuilder))
//      , Map(
//        (1, KeyPress("w")) -> List(forward)
//        , (1, KeyPress("s")) -> List(backwards)
//        , (1, KeyPress("a")) -> List(rightRotationBuilder)
//        , (1, KeyPress("d")) -> List(leftRotationBuilder)
//
//        , (2, KeyPress("k")) -> List(forward)
//        , (2, KeyPress("j")) -> List(backwards)
//        , (2, KeyPress("l")) -> List(rightRotationBuilder)
//        , (3, KeyPress("h")) -> List(leftRotationBuilder)
//      )
//    )
//  }
//
