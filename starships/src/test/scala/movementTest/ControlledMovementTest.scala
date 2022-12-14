package movementTest

import actionSource.movement.{ControlledMovementActionSource, RegularControlledMovementActionSourceConfig}
import entity.Entity
import entity.value.EntityType
import entity.value.motion.{Coordinate, Motion, Rotation, Speed}
import gameFlow.GameFlow
import gameState.PlayingGameState
import org.scalatest.funsuite.AnyFunSuite
import seed.{BooleanSeed, CrescendoIntSeed, IntSeed, PatternBooleanSeed}

class ControlledMovementTest extends AnyFunSuite {
  val seed: IntSeed = CrescendoIntSeed(3)
  val booleanSeed: BooleanSeed = PatternBooleanSeed(List(true, true, false, true, false))
  val zeroZero: Coordinate = Coordinate(0, 0)
  val noRotation: Rotation = Rotation(0, 0)
  val speedOneOne: Speed = Speed(Coordinate(1, 1), 0, 0)
  val asteroid: Entity = Entity(1, EntityType.ASTEROID, Motion(zeroZero, noRotation, speedOneOne), 1, 5)
  val gameData: PlayingGameState = PlayingGameState(Map(1 -> asteroid), seed, booleanSeed, secondsSinceLastTime = 1)
  val gameFlow: GameFlow = GameFlow(List(ControlledMovementActionSource(RegularControlledMovementActionSourceConfig())))

  test ("An empty Set should have size 0") {
    val playingGameState = gameFlow.nextFrame(gameData)
    val entity = playingGameState.entity(1)
    assert(entity.get.motion.position == Coordinate(1,1))
  }

}
