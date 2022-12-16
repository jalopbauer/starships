package config

import entity.*
import entity.value.*
import entity.value.motion.*
import seed.*

case object ConfigFile:

  val border: Int = 800
  val idSeed: IntSeed = CrescendoIntSeed()
  val booleanSeed: BooleanSeed = PatternBooleanSeed(List(true, true, false, true, false))
  val shipShape: Shape = Shape(40, 30)
  val amountOfPlayers: Int = 2
  val playerShipsMotions: List[Motion] = List(
      Motion(Coordinate(300,200), Rotation(0 , 10), Speed(Coordinate(0,0), 10, 10, 20))
    , Motion(Coordinate(200,300), Rotation(0 , 10), Speed(Coordinate(0,0), 10, 10, 20))
  )

  val playerShipsDamage: List[Int] = List(10, 10)
  val playerShipsHealth: List[Int] = List(100, 100)

  val shipsControlledMovementKeyPresses: List[ControlledMovementKeyPresses] = List(
    ControlledMovementKeyPresses(
      KeyPress("w")
      , KeyPress("s")
      , KeyPress("a")
      , KeyPress("d")
    ),
    ControlledMovementKeyPresses(
      KeyPress("j")
      , KeyPress("k")
      , KeyPress("h")
      , KeyPress("l")
    )
  )

  val shipsShootKey: List[KeyPress] = List(
    KeyPress("r"),
    KeyPress("g")
  )

  val timeBetweenAsteroidSwarm: Double = 10
  val asteroidSpawnPerZone: Int = 3
  val asteroidSpeed: List[Speed] =
    List(
      Speed(Coordinate(1, 1).normalize, 0, 0, 20),
      Speed(Coordinate(3, 1).normalize, 0, 0, 20),
      Speed(Coordinate(1, 3).normalize, 0, 0, 20)
    )
  val asteroidHealth: List[Int] = List(1, 2, 3)
  val asteroidDamage: List[Int] = List(1, 1, 1)
