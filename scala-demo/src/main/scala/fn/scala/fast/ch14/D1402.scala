package fn.scala.fast.ch14

object D1402 {
  def meet1(ch: Char) = ch match {
    case '+' => println("[" + ch + "] => +")
    case '-' => println("[" + ch + "] => -")
    case _ if Character.isDigit(ch) => println("[" + ch + "] => " + Character.digit(ch, 10))
    case _ => println("[" + ch + "] => *")
  }

  def main(args: Array[String]): Unit = {
    meet1('c')
    meet1('+')
    meet1('-')
    meet1('0')
    meet1('5')
    meet1(' ')
  }
}
