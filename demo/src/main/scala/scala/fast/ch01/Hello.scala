package scala.fast.ch01

object Hello {
  def main(args: Array[String]): Unit = {
    println("hello world!")

    val s = "Hello World!!"
    println("s = " + s)
    println("s.toCharArray = " + s.toCharArray.mkString(""))
    s.toCharArray.foreach(print)
    println
    println("s.toLowerCase = " + s.toLowerCase)
  }
}
