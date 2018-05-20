package scala.fast.ch12

object T10 {
  def unless(condition: => Boolean)(block: => Unit) = {
    if (!condition) {
      block
    }
  }

  def main(args: Array[String]): Unit = {
    var x = 10

    unless(x == 0) {
      x -= 1
      println(x)
    }

    unless(x == 9) {
      x -= 1
      println(x)
    }
  }
}
