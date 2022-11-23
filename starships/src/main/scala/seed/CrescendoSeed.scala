package seed

case class CrescendoSeed(currentId: Int) extends Seed:
  def next: (Int, Seed) =
    (currentId, this.copy(currentId+1))

