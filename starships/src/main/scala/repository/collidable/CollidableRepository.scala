package repository.collidable

import model.collidable.Collidable

trait CollidableRepository:
  def findById(collidableId: Int): Collidable