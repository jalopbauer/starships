package entity.value.motion
case class Motion(position: Coordinate, rotation: Rotation, speed: Speed):
  def moveForward(secondsSinceLastTime: Double): Motion =
    this.copy(speed = speed.moveForward(rotation.angleInDegrees, secondsSinceLastTime))
  def moveBackward(secondsSinceLastTime: Double): Motion =
    this.copy(speed = speed.moveBackward(rotation.angleInDegrees, secondsSinceLastTime))

  def rotateLeft: Motion =
    this.copy(rotation = rotation.rotateLeft)

  def rotateRight: Motion =
    this.copy(rotation = rotation.rotateRight)