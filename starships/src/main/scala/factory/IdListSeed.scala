package factory

import seed.IntSeed

import scala.collection.immutable.List

case class IdListSeed(seed: IntSeed, ids: List[Int] = List())
