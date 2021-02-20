package fn.scala.fast.ch04

object T1 {
  def discount1(map: Map[String, Double]) = {
    for ((k, v) <- map) yield (k, v * 0.9)
  }

  def discount2(map: Map[String, Double]) = {
    map.map { case (k, v) => (k, v * 0.9) }
  }

  def main(args: Array[String]): Unit = {
    val map = Map("Apple" -> 5.5, "Banana" -> 4.3, "Orange" -> 7.6)
    println("map: " + map)
    println("discount1(map): " + discount1(map))
    println("discount2(map): " + discount2(map))
  }
}
