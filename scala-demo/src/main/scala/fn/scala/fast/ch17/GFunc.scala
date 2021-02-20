package fn.scala.fast.ch17

object GFunc {
  def get[T](item: T) = item.toString

  def main(args: Array[String]): Unit = {
    println(get("abc"))
    println(get('c'))
    println(get(1))
    println(get[Double](1))
  }
}
