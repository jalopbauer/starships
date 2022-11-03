package model

import model.collidable.Collidable
import model.value.collision.Collision

trait GameData():
  def collisions: List[Collision]
  def put(collidables: List[Collidable]):GameData