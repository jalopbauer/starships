package entity.value.motion
case class Motion(position: Coordinate, angleInDegrees: Double, speed: Speed):
  def move(secondsSinceLastTime: Double): Motion =
    this.copy(speed = speed.move(angleInDegrees, secondsSinceLastTime))
