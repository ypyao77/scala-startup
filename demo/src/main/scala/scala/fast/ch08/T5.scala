package scala.fast.ch08

object T5 {
  class Point(x: Int, y: Int) {
    override def toString = "Point(" + x + ", " + y + ")"
  }

  class LabeledPoint(label: String, x: Int, y: Int) extends Point(x, y) {
    override def toString = "LabeledPoint(\"" + label + "\", " + x + ", " + y + ")"
  }

  def main(args: Array[String]): Unit = {
    println("Point: " + new Point(5, 4))
    println("LabeledPoint: " + new LabeledPoint("my label", 35, 44))
  }
}
