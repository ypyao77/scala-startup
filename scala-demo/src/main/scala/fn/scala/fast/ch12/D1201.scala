package fn.scala.fast.ch12

object D1201 {
  import scala.math._

  def main(args: Array[String]): Unit = {
    val num = 3.14
    val fun = ceil _

    println(num)
    println(fun(2.41))
    println(fun(-2.41))
  }
}
