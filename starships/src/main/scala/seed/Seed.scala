package seed

trait Seed:
  def next: (Int, Seed)
