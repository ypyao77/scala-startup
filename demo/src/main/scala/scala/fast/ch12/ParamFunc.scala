package scala.fast.ch12

object ParamFunc {
  def valueAtOneQuarter(f: (Double) => Double) = f(0.25)

  def triple1(x: Double): Double = 3 * x

  def main(args: Array[String]): Unit = {
    import scala.math._

    println("valueAtOneQuarter(ceil _): " + valueAtOneQuarter(ceil _))
    println("valueAtOneQuarter(sqrt _): " + valueAtOneQuarter(sqrt _))

    val triple2 = (x: Double) => 3 * x
    val triple3 : (Double) => Double = 3 * _
    val triple4 = 3 * (_: Double)

    println("valueAtOneQuarter(triple1): " + valueAtOneQuarter(triple1 _))
    println("valueAtOneQuarter(triple2): " + valueAtOneQuarter(triple2))
    println("valueAtOneQuarter(triple3): " + valueAtOneQuarter(triple3))
    println("valueAtOneQuarter(triple4): " + valueAtOneQuarter(triple4))
  }
}
