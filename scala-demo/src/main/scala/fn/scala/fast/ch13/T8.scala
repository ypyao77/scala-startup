package fn.scala.fast.ch13

object T8 {
  def div(array: Array[Double], columns: Int) = {
    array.grouped(columns).toArray
  }

  def main(args: Array[String]): Unit = {
    val array = Array(1.0, 2, 3, 4, 5, 6)

    div(array, 3).foreach(line => println(line.mkString(", ")))
    println()
    div(array, 4).foreach(line => println(line.mkString(", ")))
  }
}
