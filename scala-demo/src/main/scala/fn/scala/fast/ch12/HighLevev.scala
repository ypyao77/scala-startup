package fn.scala.fast.ch12

object HighLevev {
  def main(args: Array[String]): Unit = {
    println("(1 to 9).map(\"*\" * _).foreach(println)")
    (1 to 9).map("*" * _).foreach(println)

    println("(1 to 9).reduceLeft(_ + _)" + (1 to 9).reduceLeft(_ + _))
    println("(1 to 9).reduceLeft(_ * _)" + (1 to 9).reduceLeft(_ * _))
  }
}
