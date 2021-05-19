package fn.scala.fast.ch03

object T1 {
  def gen(n: Int): Array[Int] = {
    import scala.util.Random
    (for (i <- 0 until n) yield Random.nextInt(n)).toArray
  }

  def main(args: Array[String]): Unit = {
    println("gen(3): ")
    gen(3).foreach(println)

    println("gen(10): ")
    gen(10).foreach(i => print(i + " "))
    println()

    println("gen(15): ")
    gen(15).foreach(i => print(i + " "))
    println()

    println("gen(20): ")
    gen(20).foreach(i => print(i + " "))
    println()
  }
}
