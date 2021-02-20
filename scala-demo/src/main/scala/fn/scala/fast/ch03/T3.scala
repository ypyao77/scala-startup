package fn.scala.fast.ch03

object T3 {
  def reorder(a: Array[Int]) = {
    (for (i <- 0 until(a.length, 2)) yield
      if (i < a.length - 1) Array(a(i + 1), a(i))
      else Array(a(i))
      ).flatten.mkString("<", ", ", ">")
  }

  def main(args: Array[String]): Unit = {
    println("reorder(0.to(4).toArray): " + reorder(0.to(4).toArray))
    println("reorder(0.to(5).toArray): " + reorder(0.to(5).toArray))
  }
}
