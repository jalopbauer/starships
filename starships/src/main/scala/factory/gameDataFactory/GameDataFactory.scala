package factory.gameDataFactory

import gameData.GameData

trait GameDataFactory:
  def create(): GameData
