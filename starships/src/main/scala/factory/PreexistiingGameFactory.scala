package factory

import config.ConfigFile
import entity.Entity
import entity.value.EntityType
import entity.value.motion.Motion
import game.Game
import gameState.PlayingGameState
import seed.IntSeed

import scala.io.Source


case class PreexistiingGameFactory() extends GameFactory:
  val idListSeedFactory: IdListSeedFactory = IdListSeedFactory()
  val playingGameStateFactory: PreexistingGameStateFactory = PreexistingGameStateFactory()
  val gameFlowFactory: GameFlowFactory = GameFlowFactory()
  def create: Game =
    val saved_file = Source.fromFile("saved_file")
    val linesOfEntities = saved_file.getLines.toList.dropRight(1)
    val entities = linesOfEntities.map(Entity.stringToEntity)
    val entitiesMap = entities.map(entity => entity.id -> entity).toMap
    saved_file.close()
    val idListSeed = idListSeedFactory.create(entities.length)
    val gameState = playingGameStateFactory.create(idListSeed, entitiesMap)
    val gameFlow = gameFlowFactory.create(idListSeed)
    Game(gameState, gameFlow)
