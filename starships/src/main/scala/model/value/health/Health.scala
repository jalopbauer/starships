package model.value.health

import model.Model

case class Health(amount:Int):
  def reduce(quantity:Int): Health = Health(amount - quantity)
  
  def kill: Health = Health(0)
