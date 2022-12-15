package collisionTest

import actionSource.collision.{CollisionActionSource, RegularCollisionActionSourceConfig}
import entity.Entity
import entity.value.{Collision, EntityType}
import entity.value.motion.{Coordinate, Motion, Rotation, Speed}
import gameFlow.GameFlow
import gameState.PlayingGameState
import org.scalatest.*
import org.scalatest.funsuite.*
import seed.*

class CollisionTest extends AnyFunSuite {
  val seed: IntSeed = CrescendoIntSeed(3)
  val booleanSeed: BooleanSeed = PatternBooleanSeed(List(true, true, false, true, false))
  val zeroZero: Coordinate = Coordinate(0, 0)
  val noRotation: Rotation = Rotation(0, 0)
  val speedOneOne: Speed = Speed(Coordinate(1, 1), 0, 0, 10)
  val asteroid: Entity = Entity(1, EntityType.ASTEROID, Motion(zeroZero, noRotation, speedOneOne), 1, 3)
  val shot: Entity = Entity(2, EntityType.SHOT, Motion(zeroZero, noRotation, speedOneOne), 1, 1)
  val ship: Entity = Entity(3, EntityType.SHIP, Motion(zeroZero, noRotation, speedOneOne), 1, 5)
  val gameData: PlayingGameState = PlayingGameState(Map(1 -> asteroid, 2 -> shot, 3 -> ship), seed, booleanSeed)
  val gameFlow: GameFlow = GameFlow(List(CollisionActionSource(RegularCollisionActionSourceConfig())))

  test("Collision between asteroid and shot") {
    testMethod(asteroid, shot, 2, 0)
  }

  test("Collision between shot and ship") {
    testMethod(shot, ship, 0, 4)
  }

  test("Collision between asteroid and ship") {
    testMethod(asteroid, ship, 2, 4)
  }

  test("Collision between shot and asteroid, testing for inverse is accurate") {
    testMethod(shot, asteroid, 0,2)
  }

  def testMethod( leftEntity: Entity, rightEntity: Entity, leftEntityExpectedHealth: Int, rightEntityExpectedHealth: Int): Assertion =
    val collision = Collision(leftEntity, rightEntity)
    val gameDataWithCollision = gameData.add(collision)
    val playingGameState = gameFlow.nextFrame(gameDataWithCollision)
    val newLeftEntity = playingGameState.entity(leftEntity.id).get
    val newRightEntity = playingGameState.entity(rightEntity.id).get
    assert(newLeftEntity.health == leftEntityExpectedHealth && newRightEntity.health == rightEntityExpectedHealth)


}
