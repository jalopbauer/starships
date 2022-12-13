package entity.value

import entity.Entity

case class ControlledMovementKeyPresses(entity: Entity
                                        , forwardKeyPress: KeyPress
                                        , backwardsKeyPress: KeyPress
                                        , rotateLeftKeyPress: KeyPress
                                        , rotateRightKeyPress: KeyPress)
