package seed

trait IntSeed(currentId: Int):
  def next: (Int, IntSeed)
