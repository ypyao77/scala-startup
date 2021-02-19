package scala.fast.ch10

object T2 {

  import java.awt.Point

  class OrderedPoint extends Point with Ordered[Point] {
    def compare(that: Point): Int =
      if (this.x < that.x) -1
      else if (this.x == that.x) {
        if (this.y < that.y) -1
        else if (this.y == that.y) 0
        else 1
      } else 1
  }

  def main(args: Array[String]): Unit = {

  }
}
