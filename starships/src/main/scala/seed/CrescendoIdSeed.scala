package seed

case class CrescendoIdSeed(currentId: Int) extends IdSeed:
  def next: (Int, IdSeed) =
    (currentId, this.copy(currentId+1))

