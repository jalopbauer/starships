package actionSource.movement
import actionSource.ActionSourceConfig
import entity.EntityIdControlledMovementKeyPresses
import entity.value.{EntityType, KeyPress}

case class RegularControlledMovementActionSourceConfig() extends ControlledMovementActionSourceConfig:
  def controlledMovementKeyPressesList: List[EntityIdControlledMovementKeyPresses] =
    List(
      EntityIdControlledMovementKeyPresses(
          1
        , KeyPress("w")
        , KeyPress("s")
        , KeyPress("a")
        , KeyPress("d")
      ) ,
      EntityIdControlledMovementKeyPresses(
        2
        , KeyPress("j")
        , KeyPress("k")
        , KeyPress("h")
        , KeyPress("l")
      )

    )

