package model.value.points

import model.Model

case class Points(amount:Int):
  def add(points:Points): Points = Points(amount+points.amount)