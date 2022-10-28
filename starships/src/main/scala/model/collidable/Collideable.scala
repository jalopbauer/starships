package model.collidable

import model.Model
import model.value.damage.Damage
import model.value.health.Health
import model.value.speed.Speed

trait Collideable(damage: Damage, health: Health, speed: Speed) extends Model