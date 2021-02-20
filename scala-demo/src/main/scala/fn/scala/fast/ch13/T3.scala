package fn.scala.fast.ch13

object T3 {
  def removeZero1(list: List[Int]): List[Int] = {
    list.filter(_ != 0)
  }

  def removeZero2(list: List[Int]): List[Int] = {
    list.filterNot(_ == 0)
  }

  def main(args: Array[String]): Unit = {
    val list = List(1, 3, 2, 0, 4, 0, 1, 2)
    println("removeZero1(list): " + removeZero1(list).mkString(", "))
    println("removeZero2(list): " + removeZero2(list).mkString(", "))
  }
}
