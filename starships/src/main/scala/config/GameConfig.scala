//package config
//
//import action.collision.{CollisionActionBuilder, CollisionDamageActionBuilder}
//import action.movement.*
//import action.spawn.{ShotSpawnAction, SpawnAction, SpawnAsteroidAction}
//import entity.value.motion.{Coordinate, Motion}
//import entity.value.{EntityType, KeyPress}
//import factory.actionSourceFactory.{ActionSourceFactory, CollisionActionSourceFactory, MovementActionSourceFactory, AsteroidSpawnActionSourceFactory}
//import seed.{BooleanSeed, CrescendoIntSeed, IntSeed, PatternBooleanSeed}
//
//case object GameConfig:
//
//  val actionSourcesFacories: List[ActionSourceFactory] = List(
//    AsteroidSpawnActionSourceFactory()
//    , MovementActionSourceFactory()
//    , CollisionActionSourceFactory()
//  )
//
//  //  Min value of 1
//  val amountOfPlayers: Int = 2
//
//  val intSeed: IntSeed = CrescendoIntSeed()
//  val booleanSeed: BooleanSeed = PatternBooleanSeed(List(true, true, false, true, false))
//
//  val shipMotionList: List[Motion] = List(Motion(Coordinate(0, 0), Coordinate(200, 200), 0)
//    , Motion(Coordinate(0, 0), Coordinate(200, 200), 0))
//
//
//  private val damageInCollision: List[CollisionActionBuilder] = List(CollisionDamageActionBuilder())
//  val collisionsActionMap: Map[(EntityType, EntityType), (List[CollisionActionBuilder], List[CollisionActionBuilder])] =
//    Map(
//      (EntityType.SHIP, EntityType.ASTEROID) -> (damageInCollision, damageInCollision)
//      , (EntityType.SHIP, EntityType.SHOT) -> (damageInCollision, damageInCollision)
//      , (EntityType.ASTEROID, EntityType.SHOT) -> (damageInCollision, damageInCollision))
//
//  private val rightRotationBuilder: ConstantRotationActionBuilder = ConstantRotationActionBuilder(-15)
//  private val leftRotationBuilder: ConstantRotationActionBuilder = ConstantRotationActionBuilder(15)
//  private val variable: VariableMovementActionBuilder = VariableMovementActionBuilder(5)
//  private val constantMovementActionBuilder: ConstantMovementActionBuilder = ConstantMovementActionBuilder()
//  private val forward: MaxValueVariableMovementActionBuilder = MaxValueVariableMovementActionBuilder(25, variable, constantMovementActionBuilder)
//  private val backwards: MaxValueVariableMovementActionBuilder = MaxValueVariableMovementActionBuilder(10, variable, constantMovementActionBuilder)
//
//  val entityMotion: Map[EntityType, List[MovementActionBuilder]] = Map(
//    EntityType.ASTEROID -> List(constantMovementActionBuilder)
//    , EntityType.SHOT -> List(constantMovementActionBuilder)
//    , EntityType.SHIP -> List())
//
//  val entityKeyPressMotion: List[Map[KeyPress,List[MovementActionBuilder]]] = List(
//    Map(KeyPress("w") -> List(forward)
//      , KeyPress("s") -> List(backwards)
//      , KeyPress("a") -> List(rightRotationBuilder)
//      , KeyPress("d") -> List(leftRotationBuilder))
//    , Map(KeyPress("k") -> List(forward)
//      , KeyPress("j") -> List(backwards)
//      , KeyPress("l") -> List(rightRotationBuilder)
//      , KeyPress("h") -> List(leftRotationBuilder)
//    )
//  )
//
//  val spawnActionList: List[SpawnAction] = List(
//    ShotSpawnAction()
//    , SpawnAsteroidAction(Motion(Coordinate(0, 0), 0), 1, 5)
//    , SpawnAsteroidAction(Motion(Coordinate(2, 1), Coordinate(0, 0), 0), 1, 5)
//    , SpawnAsteroidAction(Motion(Coordinate(3, 2), Coordinate(0, 0), 0), 2, 2)
//    , SpawnAsteroidAction(Motion(Coordinate(2, 3), Coordinate(0, 0), 0), 1, 2)
//
//    , SpawnAsteroidAction(Motion(Coordinate(-1, -2), Coordinate(800, 800), 0), 1, 5)
//    , SpawnAsteroidAction(Motion(Coordinate(-2, -1), Coordinate(800, 800), 0), 1, 5)
//    , SpawnAsteroidAction(Motion(Coordinate(-3, -2), Coordinate(800, 800), 0), 2, 2)
//    , SpawnAsteroidAction(Motion(Coordinate(-2, -3), Coordinate(800, 800), 0), 1, 2)
//
//    , SpawnAsteroidAction(Motion(Coordinate(1, -2), Coordinate(0, 800), 0), 1, 5)
//    , SpawnAsteroidAction(Motion(Coordinate(2, -1), Coordinate(0, 800), 0), 1, 5)
//    , SpawnAsteroidAction(Motion(Coordinate(3, -2), Coordinate(0, 800), 0), 2, 2)
//    , SpawnAsteroidAction(Motion(Coordinate(2, -3), Coordinate(0, 800), 0), 1, 2)
//
//    , SpawnAsteroidAction(Motion(Coordinate(-1, 2), Coordinate(800, 0), 0), 1, 5)
//    , SpawnAsteroidAction(Motion(Coordinate(-2, 1), Coordinate(800, 0), 0), 1, 5)
//    , SpawnAsteroidAction(Motion(Coordinate(-3, 2), Coordinate(800, 0), 0), 2, 2)
//    , SpawnAsteroidAction(Motion(Coordinate(-2, 3), Coordinate(800, 0), 0), 1, 2)
//  )
