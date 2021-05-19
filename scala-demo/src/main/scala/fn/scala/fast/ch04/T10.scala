package fn.scala.fast.ch04

object T10 {
  def main(args: Array[String]): Unit = {
    println("\"Hello\".zip(\"World\"): " + "Hello".zip("World"))
    println("\"Hellos\".zip(\"World\"): " + "Hellos".zip("World"))
    println("\"Hello\".zip(\"WorldCup\"): " + "Hello".zip("WorldCup"))
  }
}
