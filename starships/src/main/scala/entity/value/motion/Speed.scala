package entity.value.motion

case class Speed(speed: Coordinate, acceleration: Double):
  def move(angleInDegrees: Double): Speed =
    val newSpeedAxisX = Math.cos(Math.toRadians(angleInDegrees + 90)) * acceleration + speed.x
    val newSpeedAxisY = Math.sin(Math.toRadians(angleInDegrees + 90)) * acceleration + speed.y
    Speed(speed.copy(newSpeedAxisX, newSpeedAxisY), acceleration)
