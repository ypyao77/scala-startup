package fn.scala.fast.ch17

object T2 {

  class Pair[T](var p: (T, T)) {
    def swap() = {
      p = (p._2, p._1)
    }

    override def toString = "Pair(" + p._1.toString + ", " + p._2.toString + ")"
  }

  object Pair {
    def apply[T](p: (T, T)) = new Pair(p)
  }

  def main(args: Array[String]): Unit = {
    val pair1 = Pair((1, 3))
    val pair2 = Pair(("aaa", "bbb"))

    println("pair1: " + pair1)
    println("pair2: " + pair2)

    pair1.swap()
    pair2.swap()

    println("pair1: " + pair1)
    println("pair2: " + pair2)
  }
}
