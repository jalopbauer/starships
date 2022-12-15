package movementTest

import org.scalatest._
import funsuite._

import gameFlow.GameFlow
import actionSource.movement.{MoveActionSource, RegularMoveActionSourceConfig}
import entity.Entity
import entity.value.motion.{Coordinate, Motion, Rotation, Speed}
import entity.value.EntityType
import gameState.PlayingGameState
import seed.*

class MovementTest extends AnyFunSuite {
  val seed: IntSeed = CrescendoIntSeed(3)
  val booleanSeed: BooleanSeed = PatternBooleanSeed(List(true, true, false, true, false))
  val zeroZero: Coordinate = Coordinate(0, 0)
  val noRotation: Rotation = Rotation(0, 0)
  val speedOneOne: Speed = Speed(Coordinate(1, 1), 0, 0, 10)
  val asteroid: Entity = Entity(1, EntityType.ASTEROID, Motion(zeroZero, noRotation, speedOneOne), 1, 5)
  val shot: Entity = Entity(2, EntityType.SHOT, Motion(zeroZero, noRotation, speedOneOne), 1, 5)
  val ship: Entity = Entity(3, EntityType.SHIP, Motion(zeroZero, noRotation, speedOneOne), 1, 5)
  val gameData: PlayingGameState = PlayingGameState(Map(1 -> asteroid, 2 -> shot, 3 -> ship), seed, booleanSeed)
  val gameFlow: GameFlow = GameFlow(List(MoveActionSource(RegularMoveActionSourceConfig())))

  test ("Asteroid moves correctly") {
    val playingGameState = gameFlow.nextFrame(gameData)
    val entity = playingGameState.entity(1)
    assert(entity.get.motion.position == Coordinate(1,1))
  }

  test("Shot moves correctly") {
    val playingGameState = gameFlow.nextFrame(gameData)
    val entity = playingGameState.entity(2)
    assert(entity.get.motion.position == Coordinate(1, 1))
  }

  test("Ship moves correctly") {
    val playingGameState = gameFlow.nextFrame(gameData)
    val entity = playingGameState.entity(3)
    assert(entity.get.motion.position == Coordinate(1, 1))
  }
}
