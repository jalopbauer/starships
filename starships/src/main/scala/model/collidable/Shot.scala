package model.collidable

import model.damage.Damage
import model.health.Health
import model.speed.Speed

case class Shot(damage: Damage, health: Health, speed: Speed) extends Collideable(damage: Damage, health: Health, speed: Speed)
