package entity.value

import entity.{Entity, EntityIdControlledMovementKeyPresses}

case class ControlledMovementKeyPresses(entity: Entity
                                        , forwardKeyPress: KeyPress
                                        , backwardsKeyPress: KeyPress
                                        , rotateLeftKeyPress: KeyPress
                                        , rotateRightKeyPress: KeyPress)
case object ControlledMovementKeyPresses:
  def apply(entity: Entity, entityIdControlledMovementKeyPresses: EntityIdControlledMovementKeyPresses): ControlledMovementKeyPresses =
    ControlledMovementKeyPresses(entity: Entity
      , entityIdControlledMovementKeyPresses.forwardKeyPress
      , entityIdControlledMovementKeyPresses.backwardsKeyPress
      , entityIdControlledMovementKeyPresses.rotateLeftKeyPress
      , entityIdControlledMovementKeyPresses.rotateRightKeyPress)