package scala.fast.ch02

object T1 {
  def signum(v: Int): Int = {
    if (v > 0) 1
    else if (v < 0) -1
    else 0
  }

  def main(args: Array[String]): Unit = {
    println("signum(2): " + signum(2))
    println("signum(-2): " + signum(-2))
    println("signum(0): " + signum(0))
  }
}
