package config
import action.movement.MovementActionBuilder
import action.spawn.SpawnAction
import config.GameConfig
import entity.value.{EntityType, KeyPress}
import seed.{BooleanSeed, IntSeed}

case object ConfigValidator:
  def validate: Either[ValidConfig, String] =
    if (GameConfig.shipMotionList.length != GameConfig.amountOfPlayers)
      Right("Amount of shipMotionList must equal amount of players")
    else if (GameConfig.entityKeyPressMotion.size != GameConfig.amountOfPlayers)
        Right("Amount of ids in shipMotionList must equal amount of players")
    else
      val playerIdsIntSeedTuple = (1 to GameConfig.amountOfPlayers).foldLeft((List():List[Int], GameConfig.intSeed))((acc, _) =>
        val generatedId = acc._2.next
        (acc._1 :+ generatedId._1, generatedId._2))
      val intSeed = playerIdsIntSeedTuple._2
      val shipIdList = playerIdsIntSeedTuple._1
      val keyPressMotionMappedById = shipIdList zip GameConfig.entityKeyPressMotion
      val movementActionMapWithKeyStroke = keyPressMotionMappedById.foldLeft(Map(): Map[(Int, KeyPress), List[MovementActionBuilder]])(
        (acc, list) =>
          val id = list._1
          val map = list._2
          acc ++ map.keys.map(key => (id, key) -> map(key)))
      
      Left(ValidConfig(intSeed, GameConfig.booleanSeed
                        , movementActionMapWithKeyStroke
                        , GameConfig.spawnActionList
                        , GameConfig.entityMotion))


case class ValidConfig(intSeed: IntSeed, booleanSeed: BooleanSeed
                       , movementActionMapWithKeyStroke: Map[(Int, KeyPress), List[MovementActionBuilder]]
                       , spawnActionList: List[SpawnAction]
                       , entityMotion: Map[EntityType, List[MovementActionBuilder]])