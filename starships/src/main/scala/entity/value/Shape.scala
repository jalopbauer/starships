package entity.value

case class Shape(width: Double, height:Double):

  def saveString: String =
    s"$width,$height"

case object Shape:
  def stringToShape(string: String): Shape =
    null