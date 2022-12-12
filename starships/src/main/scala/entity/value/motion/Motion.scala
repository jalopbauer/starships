package entity.value.motion

import java.lang.Math.sin
import java.lang.Math.cos

case class Motion(position: Coordinate, degree: Int, speed: Double):
  def newMotion: Motion =
    val newCoordinate = Coordinate(position.x + speed * sin(Math.toRadians(degree))
      , position.x - speed * cos(Math.toRadians(degree)))
    this.copy(position = newCoordinate)

  def rotate(rotationValueInDegrees:Double): Motion =
    val newDegree = degree + rotationValueInDegrees
    val y = position.y
    val x = position.x
    val newX = x * Math.cos(Math.toRadians(newDegree)) - y * Math.sin(Math.toRadians(newDegree))
    val newY = y * Math.cos(Math.toRadians(newDegree)) + x * Math.sin(Math.toRadians(newDegree))
    this.copy(position = Coordinate(newX, newY))

