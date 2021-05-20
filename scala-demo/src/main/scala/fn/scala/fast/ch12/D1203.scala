package fn.scala.fast.ch12

object D1203 {
  def main(args: Array[String]): Unit = {
    import scala.math._
    def valueAtOneQuarter(f: (Double) => Double) = f(0.25)

    println(valueAtOneQuarter(ceil _))
    println(valueAtOneQuarter(sqrt _))
    println(valueAtOneQuarter(pow(2, _)))

    println(valueAtOneQuarter((x: Double) => 3*x))
    println(valueAtOneQuarter((x) => 3*x))
    println(valueAtOneQuarter(x => 3*x))
  }
}
