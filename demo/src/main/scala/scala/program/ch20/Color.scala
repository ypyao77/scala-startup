package scala.program.ch20

object Color extends Enumeration {
  val Red = Value
  val Green = Value
  val Blue = Value

  // val Red, Green, Blue = Value

  def main(args: Array[String]): Unit = {
    println("Color: " + Color)
    println("Red: " + Red)
    println("Green: " + Green)
    println("Blue: " + Blue)
  }
}
