package actionSource.movement
import actionSource.ActionSourceConfig
import entity.EntityIdControlledMovementKeyPresses
import entity.value.{ControlledMovementKeyPresses, EntityType, KeyPress}


case class InputControlledMovementActionSourceConfig(controlledMovementKeyPressesList: List[EntityIdControlledMovementKeyPresses]) extends ControlledMovementActionSourceConfig