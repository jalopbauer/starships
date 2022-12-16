package entity.value.motion

import scala.annotation.targetName
import scala.math.{pow, sqrt}

case class Coordinate(x: Double, y: Double):
  
  @targetName("+")
  def +(coordinate: Coordinate): Coordinate =
    this.copy(x + coordinate.x, y + coordinate.y)

  @targetName("*")
  def *(coefficient: Double): Coordinate =
    Coordinate(x * coefficient, y * coefficient)

  def length: Double =
    sqrt(x*x + y*y)

  def normalize: Coordinate =
    val length = this.length
    Coordinate(x/length, y/length)

  def saveString: String =
    s"$x, $y"