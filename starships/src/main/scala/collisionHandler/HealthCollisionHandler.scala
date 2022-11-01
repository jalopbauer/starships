package collisionHandler

import model.collidable.{Asteroid, Shot, Starship}
import model.value.collision.Collision

case object HealthCollisionHandler:
  def handleCollision(collision: Collision): Collision = collision match
    case Collision(l:Asteroid, r:Starship) =>
      val asteroid = l.copy(health = l.health.kill)
      val starship = r.copy(health = r.health.reduce(l.damage.amount))
      Collision(asteroid, starship)
    case Collision(l:Starship, r:Asteroid) =>
      val asteroid = r.copy(health = r.health.kill)
      val starship = l.copy(health = l.health.reduce(r.damage.amount))
      Collision(starship, asteroid)
    case Collision(l: Shot, r:Asteroid) =>
      val shot = r.copy(health = r.health.kill)
      val asteroid = l.copy(health = l.health.reduce(l.damage.amount))
      Collision(shot, asteroid)
    case Collision(l: Asteroid, r:Shot) =>
      val shot = l.copy(health = l.health.kill)
      val asteroid = r.copy(health = r.health.reduce(l.damage.amount))
      Collision(asteroid, shot)
    case Collision(l: Shot, r: Starship) =>
      val shot = r.copy(health = r.health.kill)
      val starship = l.copy(health = l.health.reduce(l.damage.amount))
      Collision(shot, starship)
    case Collision(l: Starship, r: Shot) =>
      val shot = l.copy(health = l.health.kill)
      val starship = r.copy(health = r.health.reduce(l.damage.amount))
      Collision(starship, shot)
    case _ => collision

