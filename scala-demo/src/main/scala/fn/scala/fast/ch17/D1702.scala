package fn.scala.fast.ch17

object D1702 {
  def getMiddle[T](a: Array[T]) = a(a.length / 2)

  def main(args: Array[String]): Unit = {
    println(getMiddle(Array(1, 2, 3, 4, 5)))
    println(getMiddle(Array('a', 'b', 'c', 'd', 'e')))
    println(getMiddle(Array("Mary", "had", "a", "little", "lamb")))

    val f = getMiddle[String] _
    println(f(Array("Mary", "had", "a", "little", "lamb")))
  }
}
