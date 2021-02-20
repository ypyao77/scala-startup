package fn.scala.fast.ch14

object T3 {
  def swap1(array: Array[Int]) = {
    array match {
      case Array(x, y, arr@_*) => Array(y, x) ++ arr
      case _ => array
    }
  }
  def arrayString(array: Array[Int]) = array.mkString("Array(", ", ", ")")

  def main(args: Array[String]): Unit = {
    println("swap1(Array()) => " + arrayString(swap1(Array())))
    println("swap1(Array(1)) => " + arrayString(swap1(Array(1))))
    println("swap1(Array(1, 2)) => " + arrayString(swap1(Array(1, 2))))
    println("swap1(Array(1, 2, 3)) => " + arrayString(swap1(Array(1, 2, 3))))
    println("swap1(Array(1, 2, 3, 4)) => " + arrayString(swap1(Array(1, 2, 3, 4))))
  }
}
