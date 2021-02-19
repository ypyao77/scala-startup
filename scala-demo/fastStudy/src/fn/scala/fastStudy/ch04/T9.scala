package scala.fast.ch04

object T9 {
  def diff(array: Array[Int], v: Int) = (array.count(_ < v), array.count(_ == v), array.count(_ > v))

  def main(args: Array[String]): Unit = {
    val array = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 8, 7, 6, 5, 6, 7, 8, 9)
    println("diff(array, 5): " + diff(array, 5))
  }
}
