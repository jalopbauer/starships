package collisionHandler

import model.value.collision.Collision

trait CollisionHandler:
  def handleCollision(collision: Collision):Collision
