package entity.value

import entity.value.KeyPress

case class ControlledMovementKeyPresses(  forwardKeyPress: KeyPress
                                        , backwardsKeyPress: KeyPress
                                        , rotateLeftKeyPress: KeyPress
                                        , rotateRightKeyPress: KeyPress)
