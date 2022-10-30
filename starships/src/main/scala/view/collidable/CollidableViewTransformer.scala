package view.collidable

import model.collidable.Collidable
import view.collidable.CollidableView

trait CollidableViewTransformer():
  def transform(collidable:Collidable):CollidableView
