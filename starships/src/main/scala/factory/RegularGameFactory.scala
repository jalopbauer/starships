package factory

import config.ConfigFile
import entity.Entity
import entity.value.EntityType
import entity.value.motion.Motion
import game.Game
import gameState.PlayingGameState
import seed.IntSeed


case class RegularGameFactory() extends GameFactory:
  val idListSeedFactory: IdListSeedFactory = IdListSeedFactory()
  val playingGameStateFactory: PlayingGameStateFactory = PlayingGameStateFactory()
  def create: Game =
    val idListSeed = idListSeedFactory.create
    val gameState = playingGameStateFactory.create(idListSeed)

    Game(gameState, null)
