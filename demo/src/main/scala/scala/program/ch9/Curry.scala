package scala.program.ch9

object Curry {
  def ff(x: Int)(y: Int) = x + y

  def gg(x: Int) = (y: Int) => x + y

  def twice(op: Double => Double, x: Double) = op(op(x))

  def main(args: Array[String]): Unit = {
    // case 1
    println("ff(3)(5): " + ff(3)(5))

    // case 2
    val f1 = ff(1) _
    val f2 = ff(1)(_)
    println("f1(3): " + f1(3))
    println("f2(3): " + f2(3))

    // case 3
    val g1 = gg(1)
    println("g1(3): " + g1(3))

    // case 4
    print("twice(_ + 1.0, 5.0): " + twice(_ + 1.0, 5.0))

  }
}
