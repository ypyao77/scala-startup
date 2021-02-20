package fn.scala.fast.ch12

object T4 {
  def fact(x: Int) = {
    (1 to x).foldLeft(1)(_ * _)
  }

  def main(args: Array[String]): Unit = {
    println("fact(1): " + fact(1))
    println("fact(2): " + fact(2))
    println("fact(5): " + fact(5))
    println("fact(-5): " + fact(-5))
  }
}
