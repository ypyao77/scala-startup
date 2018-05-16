package scala.fast.ch08

object T3 {

  abstract class Shape {
    override def toString = "Shape"

    def draw() = {
      println("This is a " + this.getClass.getName)
    }
  }

  class Circle extends Shape {
  }

  class Square extends Shape {
  }

  def main(args: Array[String]): Unit = {
    val circle = new Circle
    val square = new Square

    circle.draw()
    square.draw()
  }
}
