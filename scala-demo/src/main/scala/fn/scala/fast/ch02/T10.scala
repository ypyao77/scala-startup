package fn.scala.fast.ch02

object T10 {
  def mi(x: Double, n: Int): Double = {
    if (n == 0) 1.0
    else if (n < 0) 1.0 / mi(x, -n)
    else if (n % 2 == 0) mi(x, n / 2) * mi(x, n / 2)
    else x * mi(x, n - 1)
  }

  def main(args: Array[String]): Unit = {
    println("mi(5, 5): " + mi(5, 5))
    println("mi(5, -15): " + mi(5, -15))
    println("mi(5, -10): " + mi(5, -10))
    println("mi(5, 10): " + mi(5, 10))
  }
}

