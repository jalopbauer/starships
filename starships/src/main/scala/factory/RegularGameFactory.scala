package factory

import game.Game


case class RegularGameFactory() extends GameFactory:
  def create: Game =
    null
