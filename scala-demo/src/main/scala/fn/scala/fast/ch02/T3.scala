package fn.scala.fast.ch02

object T3 {
  def main(args: Array[String]): Unit = {
    var y = 0
    var x = {}
    x = y = 1
    println("x = y = 1: " + (x = y = 1))
    println("x: " + x)
    println("y: " + y)
  }
}
