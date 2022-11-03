package model.value.playerPoints

import model.Model
import model.value.player.Player
import model.value.points.Points

case class PlayerPoints(player: Player, points: Points):
  def add(playerPoints: PlayerPoints): PlayerPoints = this.copy(points = points.add(playerPoints.points))