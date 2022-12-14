package entity.value.motion
case class Motion(position: Coordinate, rotation: Rotation, speed: Speed):
  def moveForward(secondsSinceLastTime: Double): Motion =
    val newSpeed = speed.moveForward(rotation.angleInDegrees, secondsSinceLastTime)
    val newPosition = position + newSpeed.speed
    this.copy(position = newPosition, speed = newSpeed)
  def moveBackward(secondsSinceLastTime: Double): Motion =
    val newSpeed = speed.moveBackward(rotation.angleInDegrees, secondsSinceLastTime)
    val newPosition = position + newSpeed.speed
    this.copy(position = newPosition, speed = newSpeed)
  def rotateLeft: Motion =
    this.copy(rotation = rotation.rotateLeft)

  def rotateRight: Motion =
    this.copy(rotation = rotation.rotateRight)