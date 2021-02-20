package fn.scala.fast.ch02

object T5 {
  def countdown(n: Int): Unit = {
    if (n <= 0) {
      print("0")
    } else {
      print(n)
      countdown(n - 1)
    }
  }

  def countdown2(n: Int) = {
    0.to(n).reverse.foreach(print)
  }

  def main(args: Array[String]): Unit = {
    println("countdown(5): ")
    countdown(5)
    println()

    println("countdown2(5): ")
    countdown2(5)
    println()
  }
}
