package fn.scala.fast.ch17

object T6 {
  def midlle[T](it: Iterable[T]): T = {
    val list = it.toList
    list(list.length / 2)
  }

  def main(args: Array[String]): Unit = {
    // println(midlle("")) //error
    // println(midlle(List())) //error

    println(midlle("a"))
    println(midlle(List(1)))

    println(midlle("middle"))
    println(midlle(List(1, 2, 3, 4, 5, 6)))
  }
}
