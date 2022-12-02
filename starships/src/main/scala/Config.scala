import action.movement.*
import action.collision.*
import action.spawn.*
import entity.value.{EntityType, KeyPress}
import entity.value.motion.{Coordinate, Motion}
import factory.actionSourceFactory.*
import seed.*

import scala.collection.immutable.Map

class Config:

  val actionSources: List[ActionSourceFactory] = List(
    SpawnActionSourceFactory()
    , MovementActionSourceFactory()
    , CollisionActionSourceFactory()
  )

//  Min value of 1
  val amountOfPlayers: Int = 2

  val intSeed: IntSeed = CrescendoIntSeed()
  val booleanSeed: BooleanSeed = PatternBooleanSeed(List(true, true, false, true, false))

  val shipMotionList: List[Motion] = List(Motion(Coordinate(0,0), Coordinate(200,200), 0)
                                          , Motion(Coordinate(0,0), Coordinate(200,200), 0))


  private val damageInCollision: List[CollisionActionBuilder] = List(CollisionDamageActionBuilder())
  val collisionsActionMap: Map[(EntityType, EntityType), (List[CollisionActionBuilder], List[CollisionActionBuilder])] =
    Map(
      (EntityType.SHIP, EntityType.ASTEROID) -> (damageInCollision, damageInCollision)
      , (EntityType.SHIP, EntityType.SHOT) -> (damageInCollision, damageInCollision)
      , (EntityType.ASTEROID, EntityType.SHOT) -> (damageInCollision, damageInCollision))

  val rightRotationBuilder: ConstantRotationActionBuilder = ConstantRotationActionBuilder(-15)
  val leftRotationBuilder: ConstantRotationActionBuilder = ConstantRotationActionBuilder(15)
  val variable: VariableMovementActionBuilder = VariableMovementActionBuilder(5)
  val constantMovementActionBuilder: ConstantMovementActionBuilder = ConstantMovementActionBuilder()
  val forward: MaxValueVariableMovementActionBuilder = MaxValueVariableMovementActionBuilder(25, variable, constantMovementActionBuilder)
  val backwards: MaxValueVariableMovementActionBuilder = MaxValueVariableMovementActionBuilder(10, variable, constantMovementActionBuilder)

  val entityMotion: Map[EntityType, List[MovementActionBuilder]] = Map(
    EntityType.ASTEROID -> List(constantMovementActionBuilder)
    , EntityType.SHOT -> List(constantMovementActionBuilder)
    , EntityType.SHIP -> List())

  val entityKeyPressMotion: Map[(Int, KeyPress), List[MovementActionBuilder]] = Map(
    (1, KeyPress("w")) -> List(forward)
    , (1, KeyPress("s")) -> List(backwards)
    , (1, KeyPress("a")) -> List(rightRotationBuilder)
    , (1, KeyPress("d")) -> List(leftRotationBuilder)

    , (2, KeyPress("k")) -> List(forward)
    , (2, KeyPress("j")) -> List(backwards)
    , (2, KeyPress("l")) -> List(rightRotationBuilder)
    , (3, KeyPress("h")) -> List(leftRotationBuilder)
  )

  val spawnActionList = List(
    ShotSpawnAction()
    , SpawnAsteroidAction(Motion(Coordinate(1, 2), Coordinate(0, 0), 0), 1, 5)
    , SpawnAsteroidAction(Motion(Coordinate(2, 1), Coordinate(0, 0), 0), 1, 5)
    , SpawnAsteroidAction(Motion(Coordinate(3, 2), Coordinate(0, 0), 0), 2, 2)
    , SpawnAsteroidAction(Motion(Coordinate(2, 3), Coordinate(0, 0), 0), 1, 2)

    , SpawnAsteroidAction(Motion(Coordinate(-1, -2), Coordinate(800, 800), 0), 1, 5)
    , SpawnAsteroidAction(Motion(Coordinate(-2, -1), Coordinate(800, 800), 0), 1, 5)
    , SpawnAsteroidAction(Motion(Coordinate(-3, -2), Coordinate(800, 800), 0), 2, 2)
    , SpawnAsteroidAction(Motion(Coordinate(-2, -3), Coordinate(800, 800), 0), 1, 2)

    , SpawnAsteroidAction(Motion(Coordinate(1, -2), Coordinate(0, 800), 0), 1, 5)
    , SpawnAsteroidAction(Motion(Coordinate(2, -1), Coordinate(0, 800), 0), 1, 5)
    , SpawnAsteroidAction(Motion(Coordinate(3, -2), Coordinate(0, 800), 0), 2, 2)
    , SpawnAsteroidAction(Motion(Coordinate(2, -3), Coordinate(0, 800), 0), 1, 2)

    , SpawnAsteroidAction(Motion(Coordinate(-1, 2), Coordinate(800, 0), 0), 1, 5)
    , SpawnAsteroidAction(Motion(Coordinate(-2, 1), Coordinate(800, 0), 0), 1, 5)
    , SpawnAsteroidAction(Motion(Coordinate(-3, 2), Coordinate(800, 0), 0), 2, 2)
    , SpawnAsteroidAction(Motion(Coordinate(-2, 3), Coordinate(800, 0), 0), 1, 2)
  )