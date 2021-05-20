package fn.scala.fast.ch13

object D1311 {
  def main(args: Array[String]): Unit = {
    val p = List(1.42, 2.38, 9.81, 6.70)
    val q = List(3, 5, 1, 4, 7)

    println(p zip p)
    println(p zip q)

    println(q zip p)
    println(q zip q)

    println(p.zipWithIndex)
    println(p.zipWithIndex.map(_._1))
    println(p.zipWithIndex.map(_._2))
    println(p.zipWithIndex.map(it => Vector(it._1, it._2)))
  }
}
