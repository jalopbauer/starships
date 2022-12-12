package entity.value.motion

import scala.math.{pow, sqrt}

case class Coordinate(x: Double, y: Double):
  
  def sum(coordinate: Coordinate): Coordinate =
    this.copy(x + coordinate.x, y + coordinate.y)
    
  def times(number:Int): Coordinate =
    this.copy(x * number, y * number)

  def dontKnowName: Double =
    sqrt(pow(x, 2) + pow(y, 2))
