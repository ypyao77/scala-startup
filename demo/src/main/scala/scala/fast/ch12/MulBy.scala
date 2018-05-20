package scala.fast.ch12

object MulBy {
  def main(args: Array[String]): Unit = {
    def mulBy(factor: Double) = (x: Double) => factor * x

    val triple = mulBy(3)
    val half = mulBy(0.5)

    println("triple(7): " + triple(7))
    println("half(6): " + half(6))
  }
}
