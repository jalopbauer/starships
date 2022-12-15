package config

import scala.collection.mutable.ListBuffer

case object ConfigValidation:
//  val gameConfig: GameConfig = GameConfig
  def validateConfig: Option[List[String]] =
    val errors = ListBuffer[String]()
    if (ConfigFile.shipsShootKey.length != ConfigFile.amountOfPlayers) errors.addOne("shipsShootKey.length must == amountOfPlayers")
    if (ConfigFile.shipsControlledMovementKeyPresses.length != ConfigFile.amountOfPlayers) errors.addOne("shipsControlledMovementKeyPresses.length must == amountOfPlayers")
    if (ConfigFile.playerShipsHealth.length != ConfigFile.amountOfPlayers) errors.addOne("playerShipsHealth.length must == amountOfPlayers")
    if (ConfigFile.playerShipsDamage.length != ConfigFile.amountOfPlayers) errors.addOne("playerShipsDamage.length must == amountOfPlayers")
    if (ConfigFile.playerShipsMotions.length != ConfigFile.amountOfPlayers) errors.addOne("playerShipsMotions.length must == amountOfPlayers")

    if (ConfigFile.timeBetweenAsteroidSwarm < 0) errors.addOne("Time can't be negative fool")
    if (ConfigFile.asteroidSpeed.length != ConfigFile.asteroidSpawnPerZone) errors.addOne("asteroidSpeed.length must == asteroidSpawnPerZone")
    if (ConfigFile.asteroidHealth.length != ConfigFile.asteroidSpawnPerZone) errors.addOne("asteroidHealth.length must == asteroidSpawnPerZone")
    if (ConfigFile.asteroidDamage.length != ConfigFile.asteroidSpawnPerZone) errors.addOne("asteroidDamage.length must == asteroidSpawnPerZone")

    if (errors.isEmpty) None
    else Some(errors.toList)
