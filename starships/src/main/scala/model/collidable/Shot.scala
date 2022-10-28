package model.collidable

import model.value.damage.Damage
import model.value.health.Health
import model.value.speed.Speed

case class Shot(damage: Damage, health: Health, speed: Speed) extends Collideable(damage: Damage, health: Health, speed: Speed)
