package fn.scala.fast.ch14

object T2 {
  def swap1(tuple: (Int, Int)) = (tuple._2, tuple._1)

  def swap2(tuple: (Int, Int)) = tuple match {
    case (x, y) => (y, x)
  }

  def main(args: Array[String]): Unit = {
    println("swap1(1, 2): " + swap1(1, 2))
    println("swap2(1, 2): " + swap2(1, 2))
  }
}
