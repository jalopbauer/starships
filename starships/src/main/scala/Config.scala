import factory.actionSourceFactory.*
import seed.*

class Config:
  
//  Min value of 1
  val amountOfPlayers: Int = 2

  val actionSources: List[ActionSourceFactory] = List(
    SpawnActionSourceFactory()
    , MovementActionSourceFactory()
    , CollisionActionSourceFactory()
  )

  val intSeed: IntSeed = CrescendoIntSeed()

