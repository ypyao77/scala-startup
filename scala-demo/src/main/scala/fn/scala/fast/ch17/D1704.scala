package fn.scala.fast.ch17

object D1704 {
  class Pair1[T <% Comparable[T]](val first: T, val second: T) {
    def smaller = if (first.compareTo(second) < 0) first else second
    override def toString: String = "Pair1(" + first + ", " + second + ")"
  }

  class Pair2[T <% Ordered[T]](val first: T, val second: T) {
    def smaller = if (first < second) first else second
    override def toString: String = "Pair2(" + first + ", " + second + ")"
  }

  def main(args: Array[String]): Unit = {
    val a = new Pair1("Mary", "Bale")
    println(a.smaller)

    val b = new Pair1(15, 11)
    println(b.smaller)

    val c = new Pair2("Mary", "Bale")
    println(c.smaller)

    val d = new Pair2(15, 11)
    println(d.smaller)
  }
}
