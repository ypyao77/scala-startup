package scala.fast.ch03

object T4 {
  def reorder(a: Array[Int]) = {
    val x = a.filter(_ > 0)
    val y = a.filter(_ <= 0)
    (x ++ y).mkString("<", ", ", ">")
  }

  def main(args: Array[String]): Unit = {
    val array = Array(1, -1, -3, 0, 4, -2, 4, 87, 0, -10, 9)
    println("reorder(array): " + reorder(array))
  }
}
