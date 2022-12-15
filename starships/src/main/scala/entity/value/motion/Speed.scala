package entity.value.motion

case class Speed(speed: Coordinate, acceleration: Double, deacceleration: Double, maxSpeed: Double):
  def accelerate(angleInDegrees: Double, secondsSinceLastTime: Double): Speed =
    val newSpeedAxisX = speed.x + Math.cos(Math.toRadians(angleInDegrees)) * acceleration * secondsSinceLastTime
    val newSpeedAxisY = speed.y + Math.sin(Math.toRadians(angleInDegrees)) * acceleration * secondsSinceLastTime
    this.copy(speed = speed.copy(newSpeedAxisX, newSpeedAxisY))

  def decelerate(angleInDegrees: Double, secondsSinceLastTime: Double): Speed =
    val newSpeedAxisX = speed.x - Math.cos(Math.toRadians(angleInDegrees)) / deacceleration / secondsSinceLastTime
    val newSpeedAxisY = speed.y - Math.sin(Math.toRadians(angleInDegrees)) / deacceleration / secondsSinceLastTime
    if (isHigherThanMaxSpeed(newSpeedAxisX, newSpeedAxisY)) this
    else this.copy(speed = speed.copy(newSpeedAxisX, newSpeedAxisY))
  private def isHigherThanMaxSpeed(newSpeedAxisX: Double, newSpeedAxisY: Double): Boolean = maxSpeed < (newSpeedAxisX.abs + newSpeedAxisY.abs)