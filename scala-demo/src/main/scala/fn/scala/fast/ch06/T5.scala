package fn.scala.fast.ch06

object T5 {
  def main(args: Array[String]): Unit = {
    val array = Array(1, 2, 3, 4, 5)
    println("reverse(array): " + array.reverse.mkString(" "))
  }
}
