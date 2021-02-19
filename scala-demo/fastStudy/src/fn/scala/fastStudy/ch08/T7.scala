package scala.fast.ch08

object T7 {

  class Square(x: Int = 0, y: Int = 0, width: Int = 0) extends java.awt.Rectangle(x, y, width, width) {
    override def toString = "Rect(" + x + ", " + y + ", " + width + ")"
  }

  object Square {
    def apply(x: Int = 0, y: Int = 0, width: Int = 0) = new Square(x, y, width)
  }

  def main(args: Array[String]): Unit = {
    val square1 = Square(width = 10)
    val square2 = Square(y = 3)
    val square3 = Square(5, 8, 12)

    println("square1: " + square1)
    println("square2: " + square2)
    println("square3: " + square3)
  }
}
