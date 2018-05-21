package scala.fast.ch13

object MyColl {
  def f1(): Unit = {
    for ( i <- (0 to 100).par) print(i + " ")
  }

  def f2(): Unit = {
    val y = for(i <- (0 to 100).par) yield i

    println("y = " + y.mkString(", "))
  }

  def main(args: Array[String]): Unit = {
    f1()
    f2()
  }
}
