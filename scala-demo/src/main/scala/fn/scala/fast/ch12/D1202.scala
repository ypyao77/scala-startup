package fn.scala.fast.ch12

object D1202 {
  import scala.math._

  def main(args: Array[String]): Unit = {
    val triple = (x: Double) => 3 * x

    println(triple(3.14))
    println("---------------------")
    Array(3.14, 2.61, 1.58, 2.0).map((x: Double) => 3 * x).foreach(println)
  }
}
