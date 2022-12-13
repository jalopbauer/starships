package entity.value.motion

case class Speed(speed: Coordinate, acceleration: Double, deacceleration: Double, maxSpeed: Double):
  def moveForward(angleInDegrees: Double, secondsSinceLastTime: Double): Speed =
    val newSpeedAxisX = speed.x + Math.cos(Math.toRadians(angleInDegrees + 90)) * acceleration
    val newSpeedAxisY = speed.y + Math.sin(Math.toRadians(angleInDegrees + 90)) * acceleration
    this.copy(speed = speed.copy(newSpeedAxisX, newSpeedAxisY) * secondsSinceLastTime)

  def moveBackward(angleInDegrees: Double, secondsSinceLastTime: Double): Speed =
    val newSpeedAxisX = speed.x - Math.cos(Math.toRadians(angleInDegrees + 90)) / deacceleration
    val newSpeedAxisY = speed.y - Math.sin(Math.toRadians(angleInDegrees + 90)) / deacceleration
    this.copy(speed = speed.copy(newSpeedAxisX, newSpeedAxisY) * secondsSinceLastTime)
