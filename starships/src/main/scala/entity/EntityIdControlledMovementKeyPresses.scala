package entity

import entity.value.KeyPress

case class EntityIdControlledMovementKeyPresses(id: Int
                                                , forwardKeyPress: KeyPress
                                                , backwardsKeyPress: KeyPress
                                                , rotateLeftKeyPress: KeyPress
                                                , rotateRightKeyPress: KeyPress)
