package fn.scala.fast.ch11

object Apply {

  class Fraction(n: Int, d: Int) {
    override def toString = "Fraction(" + n + ", " + d + ")"
  }

  object Fraction {
    def apply(n: Int, d: Int) = new Fraction(n, d)
  }

  def main(args: Array[String]): Unit = {
    println("Fraction(3, 5): " + Fraction(3, 5))
  }
}
