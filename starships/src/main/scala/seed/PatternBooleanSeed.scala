package seed

case class PatternBooleanSeed(pattern: List[Boolean]) extends BooleanSeed:
  def next: (Boolean, PatternBooleanSeed) =
    println(s"pattern = ${pattern}")
    val head = pattern.head
    (head, PatternBooleanSeed(pattern.tail :+ head))

