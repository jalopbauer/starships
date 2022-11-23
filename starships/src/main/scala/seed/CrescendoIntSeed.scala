package seed

case class CrescendoIntSeed(currentId: Int) extends IntSeed:
  def next: (Int, IntSeed) =
    (currentId, this.copy(currentId+1))

