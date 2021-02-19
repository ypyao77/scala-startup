package scala.fast.ch03

object T1 {
  def gen(n: Int): Array[Int] = {
    import scala.util.Random
    (for (i <- 0 until n) yield Random.nextInt(n)).toArray
  }

  def main(args: Array[String]): Unit = {
    println("gen(10): ")
    gen(10).foreach(println)
    println("gen(15): ")
    gen(15).foreach(println)
    println("gen(20): ")
    gen(20).foreach(println)
  }
}
