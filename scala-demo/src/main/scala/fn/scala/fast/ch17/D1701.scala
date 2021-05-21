package fn.scala.fast.ch17

object D1701 {
  class Pair[T, S](val first: T, val second: S) {
    override def toString: String = "Pair(" + first + ", " + second + ")"
  }

  def main(args: Array[String]): Unit = {
    println(new Pair(1, "Student"))
    println(new Pair("Hi", "Barry"))
  }
}
