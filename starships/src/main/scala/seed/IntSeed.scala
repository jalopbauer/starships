package seed

trait IntSeed:
  def next: (Int, IntSeed)
