package entity.value.motion

case class Rotation(angleInDegrees: Double, rotationAngleInDegrees: Double):
  def rotateLeft: Rotation =
    this.copy(angleInDegrees - rotationAngleInDegrees)

  def rotateRight: Rotation =
    this.copy(angleInDegrees + rotationAngleInDegrees)

  def saveString: String =
    s"$angleInDegrees, $rotationAngleInDegrees"

case object Rotation:
  def stringToRotation(string: String): Rotation =
    val array = string.split(",")
    Rotation(array(0).toDouble, array(1).toDouble)