package actionSource.movement
import actionSource.ActionSourceConfig
import entity.EntityIdControlledMovementKeyPresses
import entity.value.{ControlledMovementKeyPresses, EntityType, KeyPress}

case class RegularControlledMovementActionSourceConfig() extends ControlledMovementActionSourceConfig:
  def controlledMovementKeyPressesList: List[EntityIdControlledMovementKeyPresses] =
    List(
      EntityIdControlledMovementKeyPresses(
          1
        , ControlledMovementKeyPresses(
            KeyPress("w")
          , KeyPress("s")
          , KeyPress("a")
          , KeyPress("d")
        )
      ) ,
      EntityIdControlledMovementKeyPresses(
        2
        , ControlledMovementKeyPresses(
            KeyPress("j")
          , KeyPress("k")
          , KeyPress("h")
          , KeyPress("l")
        )
      )

    )

