package factory.actionSourceFactory

import action.movement.constantMovementAction.ConstantMovementActionBuilder
import action.movement.constantRotationAction.ConstantRotationActionBuilder
import action.movement.maxValueVariableMovementAction.MaxValueVariableMovementActionBuilder
import action.movement.variableMovementAction.VariableMovementActionBuilder
import actionSource.ActionSource
import actionSource.movement.MovementActionSource
import entity.value.{EntityType, KeyStroke, KeyStrokeAction}

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
        , EntityType.SHOT -> List(constantMovementActionBuilder))
      , Map(
        (1, KeyStroke('w', KeyStrokeAction.FORWARD)) -> List(forward)
        , (1, KeyStroke('s', KeyStrokeAction.BACKWARDS)) -> List(backwards)
        , (1, KeyStroke('a', KeyStrokeAction.ROTATE_RIGHT)) -> List(rightRotationBuilder)
        , (1, KeyStroke('d', KeyStrokeAction.ROTATE_LEFT)) -> List(leftRotationBuilder)

        , (2, KeyStroke('k', KeyStrokeAction.FORWARD)) -> List(forward)
        , (2, KeyStroke('j', KeyStrokeAction.BACKWARDS)) -> List(backwards)
        , (2, KeyStroke('l', KeyStrokeAction.ROTATE_RIGHT)) -> List(rightRotationBuilder)
        , (3, KeyStroke('h', KeyStrokeAction.ROTATE_LEFT)) -> List(leftRotationBuilder)
      )
    )
  }

