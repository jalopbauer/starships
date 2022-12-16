package factory

import config.ConfigFile
import entity.Entity
import entity.value.EntityType
import entity.value.motion.Motion
import game.Game
import gameState.PlayingGameState
import seed.IntSeed


case class PreexistingGameStateFactory():
  def create(idListSeed: IdListSeed, entitiesMap: Map[Int, Entity]): PlayingGameState =
    PlayingGameState(entitiesMap, idListSeed.seed, ConfigFile.booleanSeed)