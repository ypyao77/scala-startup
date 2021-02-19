package scala.program.ch31

object Test6 {
  def main(args: Array[String]) {
    val d@(c@Some(a), Some(b)) = (Some(1), Some(2))

    println(d)
    println(c)
    println(a)
    println(b)

    println()
    (Some(1), Some(2)) match {
      case d@(c@Some(a), Some(b)) => println(a, b, c, d)
    }

    println()
    println()
    for (x@Some(y) <- Seq(None, Some(1)))
      println(x, y)

    val List(x, xs@_*) = List(1, 2, 3)
    println(x)
    println(xs)
    println()

    val o: Option[Int] = Some(2)
    o match {
      case Some(x) => println(x)
      case None =>
    }
    o match {
      case x@Some(_) => println(x)
      case None =>
    }
  }
}
