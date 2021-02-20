package fn.scala.fast.ch17

object GClass {
  class Pair[T, S](val first: T, val second: S) {
    override def toString = "Pair(" + first.toString + ", " + second.toString + ")"
  }

  def main(args: Array[String]): Unit = {
    println(new Pair(1, "cc"))
    println(new Pair(1, 'c'))
    println(new Pair[Double, Char](1, 'c'))
  }
}
