package seed

case class CrescendoIntSeed(currentId: Int) extends IntSeed(currentId):
  def next: (Int, IntSeed) =
    (currentId, this.copy(currentId+1))

object CrescendoIntSeed:
  def apply(): CrescendoIntSeed = CrescendoIntSeed(0)