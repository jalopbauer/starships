package factory.actionSourceFactory

import action.movement.constantMovementAction.ConstantMovementActionBuilder
import action.movement.constantRotationAction.ConstantRotationActionBuilder
import action.movement.maxValueVariableMovementAction.MaxValueVariableMovementActionBuilder
import action.movement.variableMovementAction.VariableMovementActionBuilder
import actionSource.ActionSource
import actionSource.movement.MovementActionSource
import actionSource.spawn.SpawnActionSource
import entity.value.{EntityType, KeyStroke, KeyStrokeAction}

case class SpawnActionSourceFactory() extends ActionSourceFactory:
  def create(): ActionSource =
    SpawnActionSource()

