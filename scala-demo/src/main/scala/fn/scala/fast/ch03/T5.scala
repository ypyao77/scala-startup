package fn.scala.fast.ch03

object T5 {
  def avg(a: Array[Double]) = {
    if (a.length == 0) 0.0
    else a.sum / a.length
  }
  def main(args: Array[String]): Unit = {
    val array = Array(1.0, 3.5, -1.9, -23.11, 42.33)
    println("avg(array): " + avg(array))
  }
}
