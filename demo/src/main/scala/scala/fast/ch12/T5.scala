package scala.fast.ch12

object T5 {
  def largest(fun: (Int) => Int, inputs: Seq[Int]) = {
    fun(inputs.reduceLeft((a, b) => if (fun(a) >= fun(b)) a else b))
  }

  def main(args: Array[String]): Unit = {
    val fun = (x: Int) => 10 * x - x * x

    println("largest(fun, 1 to 10): " + largest(fun, 1 to 10))
    println("largest(fun, 1 to 2): " + largest(fun, 1 to 2))
    println("largest(fun, 1 to 1): " + largest(fun, 1 to 1))
    println("largest(fun, 1 to -10): " + largest(fun, 1 to -10))
  }
}
