package fn.scala.fast.ch13

object T6 {

  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, 5)

    println((list :\ List[Int]()) (_ :: _))
    println((List[Int]() /: list) ((a, b) => b :: a))
  }
}
