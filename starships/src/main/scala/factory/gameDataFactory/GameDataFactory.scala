package factory.gameDataFactory

import gameData.PlayingGameData

trait GameDataFactory:
  def create(): PlayingGameData
