package fn.scala.fast.ch17

object T3 {

  class Pair[T, S] {
    def swap[S, T](p: (T, S)) = (p._2, p._1)
  }

  object Pair {
    def apply[T, S]() = new Pair()
  }

  def main(args: Array[String]): Unit = {
    println(Pair().swap((3, "abc")))
    println(Pair().swap(("xxx", 4.4)))
  }
}
