
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
  
  