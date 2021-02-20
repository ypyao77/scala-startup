package fn.scala.fast.ch02

object For {
  def f1 = {
    println("f1()")

    for {
      i <- 0 to 4
      if (i % 2 == 0)
      j <- 0 to 6
      if (j % 3 == 0)
      k <- 0 to 2
    } {
      println(f"($i,$j,$k)")
    }
  }

  def f2 = {
    println("f2()")

    val all = for {
      i <- 0 to 4
      if (i % 2 == 0)
      j <- 0 to 6
      if (j % 3 == 0)
      k <- 0 to 2
      if (k % 5 == 0)
    } yield (i, j, k)

    all.foreach(println)
  }

  def main(args: Array[String]): Unit = {
    f1
    f2
  }
}
