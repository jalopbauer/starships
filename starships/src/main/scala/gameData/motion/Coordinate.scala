package gameData.motion

case class Coordinate(x: Int, y: Int):
  
  def sum(coordinate: Coordinate): Coordinate =
    this.copy(x + coordinate.x, y + coordinate.y)
