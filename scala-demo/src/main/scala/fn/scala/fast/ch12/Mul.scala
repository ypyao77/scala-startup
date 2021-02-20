package fn.scala.fast.ch12

object Mul {
  def f1() = {
    def mulOneAtATime(x: Int) = (y: Int) => x * y

    println("mulOneAtATime(6)(7): " + mulOneAtATime(6)(7))
  }

  def f2() = {
    def mulOneAtATime(x: Int)(y: Int) = x * y

    println("mulOneAtATime(6)(7): " + mulOneAtATime(6)(7))
  }

  def main(args: Array[String]): Unit = {
    f1()
    f2()
  }
}
