package fn.scala.fast.ch12

object D1206 {
  def main(args: Array[String]): Unit = {
    def mulBy(factor: Double) = (x: Double) => factor * x

    val triple = mulBy(3)
    val half = mulBy(0.5)

    println(triple(14) + " " + half(14))
  }
}
