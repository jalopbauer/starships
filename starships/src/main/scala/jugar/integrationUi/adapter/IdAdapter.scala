package jugar.integrationUi.adapter

case class IdAdapter():
  def meThem(id: Int): String =
    id.toString

  def themMe(id: String): Int =
    id.toInt