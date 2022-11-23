package seed

trait IdSeed:
  def next: (Int, IdSeed)
