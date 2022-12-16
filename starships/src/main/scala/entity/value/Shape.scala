package entity.value

import entity.value.motion.Coordinate

case class Shape(width: Double, height:Double):

  def saveString: String =
    s"$width,$height"

case object Shape:
  def stringToShape(string: String): Shape =
    val array = string.split(",")
    Shape(array(0).toDouble, array(1).toDouble)