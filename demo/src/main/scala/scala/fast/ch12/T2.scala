package scala.fast.ch12

object T2 {
  val XS = 3 to 10

  def f1(): Unit = {
    val max = XS.reduceLeft((x, y) => if (x < y) y else x)
    println("max(3 to 10): " + max)
  }

  def f2(): Unit = {
    val max = (0 /: XS)((x, y) => if (x < y) y else x)
    println("max(3 to 10): " + max)
  }

  def f3(): Unit = {
    val max = (XS :\ 0)((x, y) => if (x < y) y else x)
    println("max(3 to 10): " + max)
  }

  def main(args: Array[String]): Unit = {
    f1()
    f2()
    f3()
  }
}
