package entity

import entity.value.{ControlledMovementKeyPresses, KeyPress}

case class EntityIdControlledMovementKeyPresses(id: Int, controlledMovementKeyPresses: ControlledMovementKeyPresses):

  def forwardKeyPress: KeyPress = controlledMovementKeyPresses.forwardKeyPress
  def backwardsKeyPress: KeyPress = controlledMovementKeyPresses.backwardsKeyPress
  def rotateLeftKeyPress: KeyPress = controlledMovementKeyPresses.rotateLeftKeyPress
  def rotateRightKeyPress: KeyPress = controlledMovementKeyPresses.rotateRightKeyPress
