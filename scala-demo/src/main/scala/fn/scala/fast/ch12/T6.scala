package fn.scala.fast.ch12

object T6 {
  def largestAt(fun: (Int) => Int, inputs: Seq[Int]) = {
    inputs.reduceLeft((a, b) => if (fun(a) >= fun(b)) a else b)
  }

  def main(args: Array[String]): Unit = {
    val fun = (x: Int) => 10 * x - x * x

    println("largest(fun, 1 to 10): " + largestAt(fun, 1 to 10))
    println("largest(fun, 1 to 2): " + largestAt(fun, 1 to 2))
    println("largest(fun, 1 to 1): " + largestAt(fun, 1 to 1))
    println("largest(fun, 1 to -10): " + largestAt(fun, 1 to -10))
  }
}
