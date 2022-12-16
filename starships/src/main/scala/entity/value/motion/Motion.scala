package entity.value.motion
case class Motion(position: Coordinate, rotation: Rotation, speed: Speed):
  def moveForward(secondsSinceLastTime: Double): Motion =
    val newSpeed = speed.accelerate(rotation.angleInDegrees, secondsSinceLastTime)
    this.copy(speed = newSpeed)
  def moveBackward(secondsSinceLastTime: Double): Motion =
    val newSpeed = speed.decelerate(rotation.angleInDegrees, secondsSinceLastTime)
    this.copy(speed = newSpeed)
  def rotateLeft: Motion =
    this.copy(rotation = rotation.rotateLeft)

  def move(): Motion =
    val newPosition = position + speed.speed
    this.copy(position = newPosition)

  def rotateRight: Motion =
    this.copy(rotation = rotation.rotateRight)

  def saveString: String =
    s"${position.saveString}/${rotation.saveString}/${speed.saveString}"