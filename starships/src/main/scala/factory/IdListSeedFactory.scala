package factory

import config.ConfigFile
import seed.IntSeed

case class IdListSeedFactory():

  def create(numbers:Int): IdListSeed =
    val amountOfEntities = 1 to numbers
    amountOfEntities.foldLeft(IdListSeed(ConfigFile.idSeed))((acc, _) =>
      val ids = acc.ids
      val seed = acc.seed
      val next = seed.next
      IdListSeed(next._2, ids.appended(next._1))
    )