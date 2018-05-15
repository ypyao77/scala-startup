package scala.fast.ch04

object T8 {
  def minmax(a: Array[Int]) = (a.min, a.max)

  def main(args: Array[String]): Unit = {
    val array = Array(0, 1, 2, 3, 4, 5)
    println("minmax(array): " + minmax(array))
  }
}
