package movementTest

import actionSource.movement.{ControlledMovementActionSource, RegularControlledMovementActionSourceConfig}
import entity.Entity
import entity.value.{EntityType, KeyPress}
import entity.value.motion.{Coordinate, Motion, Rotation, Speed}
import gameFlow.GameFlow
import gameState.PlayingGameState
import org.scalatest.funsuite.AnyFunSuite
import seed.{BooleanSeed, CrescendoIntSeed, IntSeed, PatternBooleanSeed}

class ControlledMovementTest extends AnyFunSuite {
  val seed: IntSeed = CrescendoIntSeed(3)
  val booleanSeed: BooleanSeed = PatternBooleanSeed(List(true, true, false, true, false))
  val zeroZero: Coordinate = Coordinate(0, 0)
  val rotation: Rotation = Rotation(0, 90)

  val speedWithAcceleration: Speed = Speed(zeroZero, 1, 0)
  val shipWithAcceleration: Entity = Entity(1, EntityType.SHIP, Motion(zeroZero, rotation, speedWithAcceleration), 1, 5)

  val speedWithDeceleration: Speed = Speed(zeroZero, 0, 1)
  val shipWithDeceleration: Entity = Entity(2, EntityType.SHIP, Motion(zeroZero, rotation, speedWithDeceleration), 1, 5)

  val speedWithBoth: Speed = Speed(zeroZero, 1, 1)
  val shipWithBoth: Entity = Entity(3, EntityType.SHIP, Motion(zeroZero, rotation, speedWithBoth), 1, 5)

  val keyPresses: List[KeyPress] = List(
    KeyPress("w")
    , KeyPress("k")
    , KeyPress("z")
    , KeyPress("x")
  )

  val gameData: PlayingGameState = PlayingGameState(
    Map(1 -> shipWithAcceleration, 2 -> shipWithDeceleration, 3 -> shipWithBoth)
    , seed, booleanSeed
    , secondsSinceLastTime = 1
    , keyPresses = keyPresses
  )

  val gameFlow: GameFlow = GameFlow(List(ControlledMovementActionSource(RegularControlledMovementActionSourceConfig())))

  test("No ship moves") {
    val playingGameState = gameFlow.nextFrame(gameData)
    val entityOne = playingGameState.entity(1)
    val entityTwo = playingGameState.entity(2)
    val entityThree = playingGameState.entity(3)
    assert(entityOne.get.motion.position == Coordinate(0, 0)
      && entityTwo.get.motion.position == Coordinate(0, 0)
      && entityThree.get.motion.position == Coordinate(0, 0))
  }

  test("ShipOne speed increases") {
    val playingGameState = gameFlow.nextFrame(gameData)
    val entityOne = playingGameState.entity(1)
    assert(entityOne.get.motion.speed.speed == Coordinate(1, 0))
  }

  test("ShipTwo speed decreases") {
    val playingGameState = gameFlow.nextFrame(gameData)
    val entityTwo = playingGameState.entity(2)
    assert(entityTwo.get.motion.speed.speed == Coordinate(-1, 0))
  }

  test("ShipThree no speed change") {
    val playingGameState = gameFlow.nextFrame(gameData)
    val entityThree = playingGameState.entity(3)
    assert(entityThree.get.motion.speed.speed == Coordinate(0, 0))
  }
}
