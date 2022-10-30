package view.collidable

import model.collidable.Collidable
import view.collidable.CollidableView

trait CollidableViewTransformer():
  def transform(collidable:Collidable):CollidableView
  def transform(collidables:List[Collidable]):List[CollidableView] =
    collidables.map(this.transform)
