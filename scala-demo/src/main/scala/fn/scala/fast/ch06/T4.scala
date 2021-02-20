package fn.scala.fast.ch06

object T4 {

  class Point(x: Int, y: Int) {
    override def toString = "(" + x.toString + " , " + y.toString + ")"
  }

  object Point {
    def apply(x: Int, y: Int) = new Point(x, y)
  }

  def main(args: Array[String]): Unit = {
    println("Point(3, 6): " + Point(3, 6))
  }
}
