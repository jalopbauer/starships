package entity.value.motion

case class Speed(speed: Coordinate, acceleration: Double, deacceleration: Double):
  def moveForward(angleInDegrees: Double, secondsSinceLastTime: Double): Speed =
    val newSpeedAxisX = speed.x + Math.cos(Math.toRadians(angleInDegrees)) * acceleration * secondsSinceLastTime
    val newSpeedAxisY = speed.y + Math.sin(Math.toRadians(angleInDegrees)) * acceleration * secondsSinceLastTime
    this.copy(speed = speed.copy(newSpeedAxisX, newSpeedAxisY))

  def moveBackward(angleInDegrees: Double, secondsSinceLastTime: Double): Speed =
    val newSpeedAxisX = speed.x - Math.cos(Math.toRadians(angleInDegrees)) / deacceleration / secondsSinceLastTime
    val newSpeedAxisY = speed.y - Math.sin(Math.toRadians(angleInDegrees)) / deacceleration / secondsSinceLastTime
    this.copy(speed = speed.copy(newSpeedAxisX, newSpeedAxisY))
