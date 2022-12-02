package factory.actionSourceFactory

import action.movement.{ConstantMovementActionBuilder, ConstantRotationActionBuilder, MaxValueVariableMovementActionBuilder, VariableMovementActionBuilder}
import actionSource.ActionSource
import actionSource.movement.MovementActionSource
import entity.value.{EntityType, KeyPress}

case class MovementActionSourceFactory() extends ActionSourceFactory:
  def create(): ActionSource = {
    val rightRotationBuilder = ConstantRotationActionBuilder(-15)
    val leftRotationBuilder = ConstantRotationActionBuilder(15)
    val variable = VariableMovementActionBuilder(5)
    val constantMovementActionBuilder = ConstantMovementActionBuilder()
    val forward = MaxValueVariableMovementActionBuilder(25, variable, constantMovementActionBuilder)
    val backwards = MaxValueVariableMovementActionBuilder(10, variable, constantMovementActionBuilder)
    MovementActionSource(
      Map(
        EntityType.ASTEROID -> List(constantMovementActionBuilder)
        , EntityType.SHOT -> List(constantMovementActionBuilder)
        , EntityType.SHIP -> List())
      , Map(
        (1, KeyPress("w")) -> List(forward)
        , (1, KeyPress("s")) -> List(backwards)
        , (1, KeyPress("a")) -> List(rightRotationBuilder)
        , (1, KeyPress("d")) -> List(leftRotationBuilder)

        , (2, KeyPress("k")) -> List(forward)
        , (2, KeyPress("j")) -> List(backwards)
        , (2, KeyPress("l")) -> List(rightRotationBuilder)
        , (3, KeyPress("h")) -> List(leftRotationBuilder)
      )
    )
  }

