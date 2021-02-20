package fn.scala.fast.ch12

object T3 {
  def fact(x: Int) = {
    (1 to x).reduceLeft(_ * _)
  }

  def main(args: Array[String]): Unit = {
    println("fact(1): " + fact(1))
    println("fact(2): " + fact(2))
    println("fact(5): " + fact(5))
    println("fact(-5): " + fact(-5))
  }
}
