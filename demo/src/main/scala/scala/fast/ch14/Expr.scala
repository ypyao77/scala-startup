package scala.fast.ch14

object Expr {
  def toMatch(ch: Char) = ch match {
    case '+' => 1
    case '-' => -1
    case _ if Character.isDigit(ch) => 0
    case _ => 255
  }
  def func1() = {
    println("\nin func1()")

    println("toMatch('+'): " + toMatch('+'))
    println("toMatch('-'): " + toMatch('-'))
    println("toMatch('1'): " + toMatch('1'))
    println("toMatch('c'): " + toMatch('c'))
  }

  def main(args: Array[String]): Unit = {
    func1()
  }
}
