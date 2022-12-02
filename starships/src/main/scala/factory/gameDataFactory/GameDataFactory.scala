package factory.gameDataFactory

import gameState.PlayingGameState

trait GameDataFactory:
  def create(): PlayingGameState
