package fn.scala.fast.ch13

object MyView {
  def f1(): Unit = {
    println("f1()")

    import scala.math._
    val powers = (0 until 1000).view.map(pow(2, _))

    println("powers(5): " + powers(5))
    println("powers(11): " + powers(11))
    println("powers(11): " + powers(11))
  }

  def f2(): Unit = {
    import scala.math._
    val a = (0 to 10).view.map(pow(2, _)).map(pow(_, 2).toLong).force
    println("a: " + a.mkString(", "))

    val b = (0 to 10).view.map(pow(2, _)).map(pow(_, 2).toLong)
    println("b: " + b.mkString(", "))
  }

  def main(args: Array[String]): Unit = {
    f1()
    f2()
  }
}
