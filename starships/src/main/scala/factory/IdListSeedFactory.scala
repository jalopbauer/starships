package factory

import config.ConfigFile
import seed.IntSeed

case class IdListSeedFactory():
  type IdListSeed = (List[Int], IntSeed)
  
  def create: (List[Int], IntSeed) =
    val amountOfEntities = 1 to ConfigFile.amountOfPlayers
    amountOfEntities.foldLeft((List(), ConfigFile.idSeed): IdListSeed)((acc, _) =>
      val ids = acc._1
      val seed = acc._2
      val next = seed.next
      (ids.appended(next._1), next._2)
    )