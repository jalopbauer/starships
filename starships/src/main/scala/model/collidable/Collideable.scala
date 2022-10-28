package model.collidable

import model.Model
import model.damage.Damage
import model.health.Health
import model.speed.Speed

trait Collideable(damage: Damage, health: Health, speed: Speed) extends Model