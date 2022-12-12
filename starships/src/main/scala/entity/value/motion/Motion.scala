package entity.value.motion
case class Motion(position: Coordinate, angleInDegrees: Double, speed: Speed):
  def move: Motion =
    this.copy(speed = speed.move(angleInDegrees))
