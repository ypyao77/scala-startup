package fn.scala.fast.ch12

object Curry {
  def main(args: Array[String]): Unit = {
    val a = Array("Hello", "World")
    val b = Array("hello", "world")
    val c = Array("hella", "world")

    println("a.corresponds(b)(_.equalsIgnoreCase(_)): " + a.corresponds(b)(_.equalsIgnoreCase(_)))
    println("a.corresponds(c)(_.equalsIgnoreCase(_)): " + a.corresponds(c)(_.equalsIgnoreCase(_)))
  }
}
