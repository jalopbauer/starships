package factory

import game.Game


trait GameFactory:
  def create: Game
