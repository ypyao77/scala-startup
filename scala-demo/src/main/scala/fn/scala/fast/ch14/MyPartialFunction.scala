package fn.scala.fast.ch14

object MyPartialFunction {
  def main(args: Array[String]): Unit = {
    val f: PartialFunction[Char, Int] = {
      case '+' => 1
      case '-' => -1
      case _ => 0
    }

    println("f('-'): " + f('-'))
    println("f('+'): " + f('+'))
    println("f('*'): " + f('*'))
  }
}
