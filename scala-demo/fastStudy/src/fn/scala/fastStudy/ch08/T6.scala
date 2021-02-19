package scala.fast.ch08

object T6 {
  class Point(x: Double, y: Double) {
    override val toString = "Point(" + x + ", " + y + ")"
  }
  object Point {
    def apply(x: Double, y: Double) = new Point(x, y)
  }

  abstract class Shape {
    def centerPoint(): Point
  }

  class Rectangle(left: Double, top: Double, width: Double, height: Double) extends Shape {
    override def centerPoint() = Point(left + width / 2.0, top + height / 2.0)
  }

  class Circle(cx: Double, cy: Double, radius: Double) extends Shape {
    override def centerPoint() = Point(cx, cy)
  }

  def main(args: Array[String]): Unit = {
    val rectangle = new Rectangle(1.0, 2.0, 6.0, 8.0)
    val circle = new Circle(6.0, 6.0, 5)

    println("rectangle.centerPoint():  " + rectangle.centerPoint())
    println("   circle.centerPoint():  " + circle.centerPoint())
  }
}
