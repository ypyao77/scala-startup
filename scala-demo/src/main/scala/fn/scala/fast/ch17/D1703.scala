package fn.scala.fast.ch17

object D1703 {
  class Pair[T <: Comparable[T]](val first: T, val second: T) {
    def smaller = if (first.compareTo(second) < 0) first else second
    override def toString: String = "Pair(" + first + ", " + second + ")"
  }

  def main(args: Array[String]): Unit = {
    val a = new Pair("Mary", "Bale")
    println(a.smaller)

    // ERROR
    // val b = new Pair(15, 11)
    // println(b.smaller)
  }
}
