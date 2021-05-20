package fn.scala.fast.ch13

object D1310 {
  def main(args: Array[String]): Unit = {
    val a = List(1, 7, 2, 9)

    println(a.reduceLeft(_ - _))
    println(a.reduceRight(_ - _))

    println(a.foldLeft(0)(_ - _))
    println(a.foldRight(0)(_ - _))

    val b = (1 to 10)
    println(b.scanLeft(0)(_ + _))
    println(b.scanLeft(0)(_ + _ + 10))
  }
}
