package model.collidable

import model.value.damage.Damage
import model.value.health.Health
import model.value.speed.Speed
import model.value.points.Points

case class Asteroid(damage: Damage, health: Health, speed: Speed, points: Points) extends Collidable(damage: Damage, health: Health, speed: Speed):
  def id: Int = 0
