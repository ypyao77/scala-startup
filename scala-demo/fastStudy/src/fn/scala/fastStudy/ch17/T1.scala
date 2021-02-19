package scala.fast.ch17

object T1 {
  class Pair[T, S](val first: T, val second: S) {
    def swap() = new Pair[S, T](second, first)

    override def toString = "Pair(" + first.toString + ", " + second.toString + ")"
  }

  object Pair {
    def apply[T, S](first: T, second: S) = new Pair(first, second)
  }

  def main(args: Array[String]): Unit = {
    println(Pair(123, "abc"))
    println(Pair(123, "abc").swap())

    println(Pair("ccc", 3.3))
    println(Pair("ccc", 3.3).swap())
  }
}
