
import action.collision.*
import entity.value.EntityType
import entity.value.motion.{Coordinate, Motion}
import factory.actionSourceFactory.*
import seed.*

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