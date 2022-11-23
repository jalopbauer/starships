package seed

trait BooleanSeed:
  def next: (Boolean, BooleanSeed)
