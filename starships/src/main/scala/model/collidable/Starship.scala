package model.collidable

import model.value.damage.Damage
import model.value.health.Health
import model.value.speed.Speed

case class Starship(damage: Damage, health: Health, speed: Speed) extends Collidable(damage: Damage, health: Health, speed: Speed):
  def id: Int = 0