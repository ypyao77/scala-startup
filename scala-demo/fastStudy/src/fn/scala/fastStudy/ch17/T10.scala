package scala.fast.ch17

object T10 {

  class Pair[T, S](var first: T, var second: S) {
    def swap(implicit ev1: S =:= T, ev2: T =:= S) { // 这里需要双重的 类型约束
      val temp = first
      first = second
      second = temp
    }

    override def toString = "Pair(" + first.toString + ", " + second.toString + ")"
  }

  object Pair {
    def apply[T, S](first: T, second: S) = new Pair(first, second)
  }

  def main(args: Array[String]): Unit = {
    val pair1 = Pair(1, "xx")
    val pair2 = Pair("aa", 1.1)
    val pair3 = Pair("aaa", "bbb")

    // println("pair1 = " + pair1.swap) // error
    // println("pair2 = " + pair2.swap) // error
    println("pair3 = " + pair3.swap)
  }
}
