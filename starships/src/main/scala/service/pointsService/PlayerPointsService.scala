package service.pointsService

import model.collidable.{Asteroid, Shot}
import model.value.collision.Collision
import model.value.player.Player
import model.value.playerPoints.PlayerPoints
import model.value.points.Points

trait PlayerPointsService():
  def playerPointsFromCollisions(collisions: List[Collision]): List[PlayerPoints] =
    val points = collisions.map(collision => collision match
      case Collision(a: Asteroid, s: Shot) => Option(PlayerPoints(s.player, a.points))
      case Collision(s: Shot, a: Asteroid) => Option(PlayerPoints(s.player, a.points))
      case _ => None
    )
    points.foldLeft(Map():Map[Player,PlayerPoints])((acc, maybePlayerPoints) =>
      if (maybePlayerPoints.isEmpty) acc
      else
        val playerPoints = maybePlayerPoints.get
        val player = playerPoints.player
        val previousPoints = acc.getOrElse(player, PlayerPoints(player, Points(0)))
        val nowPoints = previousPoints.add(playerPoints)
        acc + (player -> nowPoints)
    ).values.toList


