package fn.scala.program.ch21

object Implicit {
  def main(args: Array[String]): Unit = {
    implicit def intToString(x: Int) = x.toString

    println("intToString(5): " + intToString(5))
    println("intToString('a'): " + intToString('a'))
  }
}
