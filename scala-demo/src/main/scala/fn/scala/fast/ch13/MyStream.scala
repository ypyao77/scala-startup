package fn.scala.fast.ch13

object MyStream {
  def f1(): Unit = {
    println("f1()")

    def numsFrom(n: BigInt): Stream[BigInt] = n #:: numsFrom(n + 1)

    var tenOrMore = numsFrom(10)
    for (i <- 0 to 20) {
      println("tenOrMore: " + tenOrMore)
      tenOrMore = tenOrMore.tail
    }
  }

  def main(args: Array[String]): Unit = {
    f1()
  }
}
