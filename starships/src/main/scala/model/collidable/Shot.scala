package model.collidable

import model.value.damage.Damage
import model.value.health.Health
import model.value.speed.Speed
import model.value.player.Player

case class Shot(damage: Damage, health: Health, speed: Speed, player: Player) extends Collidable(damage: Damage, health: Health, speed: Speed):
  def id: Int = 0
