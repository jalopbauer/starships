package entity.value.motion

import java.lang.Math.sin
import java.lang.Math.cos

case class Motion(position: Coordinate, degree: Int, speed: Double):
  def newMotion: Motion =
    val newCoordinate = Coordinate(position.x + speed * sin(degree)
      , position.x - speed * cos(degree))
    this.copy(position = newCoordinate)
