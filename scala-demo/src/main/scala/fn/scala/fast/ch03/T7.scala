package fn.scala.fast.ch03

object T7 {
  def distinct1(a: Array[Int]) = {
    a.distinct.sorted.mkString("<", ", ", ">")
  }

  def distinct2(a: Array[Int]) = {
    a.toSet.toArray.sorted.mkString("<", ", ", ">")
  }

  def main(args: Array[String]): Unit = {
    val a = Array(1, -1, -3, 0, 4, -2, 4, 87, 0, -10, 9, 1, -1, 3, -3)

    println("distinct1(a): " + distinct1(a))
    println("distinct2(a): " + distinct2(a))
  }
}
