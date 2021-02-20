package fn.scala.fast.ch10

object T1 {

  import java.awt.geom.Ellipse2D

  trait RectangleLike {
    this: Ellipse2D.Double =>
    def translate(x: Double, y: Double) {
      this.x = x
      this.y = y
    }

    def grow(x: Double, y: Double) {
      this.x += x
      this.y += y
    }
  }

  def main(args: Array[String]): Unit = {
    val egg = new Ellipse2D.Double(5, 10, 20, 30) with RectangleLike
    println("x = " + egg.getX + " y = " + egg.getY)
    egg.translate(10, -10)
    println("x = " + egg.getX + " y = " + egg.getY)
    egg.grow(10, 20)
    println("x = " + egg.getX + " y = " + egg.getY)
  }
}
