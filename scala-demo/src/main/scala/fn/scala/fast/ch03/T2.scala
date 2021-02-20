package fn.scala.fast.ch03

object T2 {
  def reorder(a: Array[Int]) = {
    for (i <- 0 until(a.length, 2) if i < a.length - 1) {
      val tmp = a(i)
      a(i) = a(i + 1)
      a(i + 1) = tmp
    }
    a.mkString("<", ", ", ">")
  }

  def main(args: Array[String]): Unit = {
    println("reorder(0.to(4).toArray): " + reorder(0.to(4).toArray))
    println("reorder(0.to(5).toArray): " + reorder(0.to(5).toArray))
  }
}
