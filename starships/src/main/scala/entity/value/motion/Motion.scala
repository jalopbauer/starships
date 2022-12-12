package entity.value.motion
case class Motion(position: Coordinate, angleInDegrees: Double, speed: Speed):
  def moveForward(secondsSinceLastTime: Double): Motion =
    this.copy(speed = speed.moveForward(angleInDegrees, secondsSinceLastTime))
