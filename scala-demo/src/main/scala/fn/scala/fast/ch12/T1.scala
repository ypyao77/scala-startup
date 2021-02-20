package fn.scala.fast.ch12

object T1 {
  def main(args: Array[String]): Unit = {
    def values(fun: (Int) => Int, low: Int, high: Int) = {
      (low to high).map(v => (v, v * v))
    }

    println("values(x => x * x, -5, 5): " + values(x => x * x, -5, 5))
  }
}
